package com.zeylin.kafkademotemplates.config.serializers;

import com.zeylin.kafkademotemplates.dto.SpaceshipDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.nio.charset.StandardCharsets;
import java.util.Map;

public class SpaceshipDeserializer implements Deserializer<SpaceshipDto> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // Configure
    }

    @Override
    public SpaceshipDto deserialize(String s, byte[] bytes) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String object = new String(bytes, StandardCharsets.UTF_8);
            return objectMapper.readValue(object, SpaceshipDto.class);
        } catch (Exception e) {
            throw new RuntimeException("Error deserializing.");
        }
    }

    @Override
    public void close() {
        // Close
    }

}
