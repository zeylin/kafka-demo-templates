package com.zeylin.kafkademotemplates.service;

import com.zeylin.kafkademotemplates.dto.SpaceshipDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SpaceshipListener {

    @KafkaListener(topics = {"${kafka.topic}"}, containerFactory = "kafkaListenerContainerFactory")
    public void onListen(SpaceshipDto dto) {
        log.info("=> Received: {}", dto);
    }

}
