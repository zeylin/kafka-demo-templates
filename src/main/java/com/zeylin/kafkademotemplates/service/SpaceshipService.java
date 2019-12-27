package com.zeylin.kafkademotemplates.service;

import com.zeylin.kafkademotemplates.dto.SpaceshipDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SpaceshipService {

    @Value("${kafka.topic}")
    private String topic;

    private final KafkaTemplate<Long, SpaceshipDto> kafkaTemplate;

    @Autowired
    public SpaceshipService(KafkaTemplate<Long, SpaceshipDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(SpaceshipDto dto) {
        log.info("<= Send: {}", dto);
        kafkaTemplate.send(topic, dto);
    }

}
