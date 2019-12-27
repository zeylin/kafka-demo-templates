package com.zeylin.kafkademotemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaDemoTemplatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoTemplatesApplication.class, args);
	}

}
