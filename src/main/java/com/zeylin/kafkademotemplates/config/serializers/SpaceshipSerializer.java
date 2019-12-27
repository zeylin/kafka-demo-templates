package com.zeylin.kafkademotemplates.config.serializers;

import com.zeylin.kafkademotemplates.dto.SpaceshipDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class SpaceshipSerializer implements Serializer<SpaceshipDto> {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpaceshipSerializer.class);

    @Override
    public void configure(Map<String, ?> map, boolean b) {
        // Configure
    }

    @Override
    public byte[] serialize(String s, SpaceshipDto object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String objectAsString = objectMapper.writeValueAsString(object);
            return objectAsString.getBytes();
        } catch (JsonProcessingException e) {
            LOGGER.warn(e.getMessage());
        }
        return new byte[0];
    }

    @Override
    public void close() {
        LOGGER.info("{} : is closing.", this.getClass().getName());
    }

}
