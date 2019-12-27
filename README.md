### kafka-demo-templates

A demo application for sending and receiving messages using Kafka templates with Spring for Apache Kafka.

### Key Dependency

Spring for Apache Kafka:

```xml
<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka</artifactId>
</dependency>
```

### Instructions

To run the project locally, first install and start Zookeeper and Kafka, and create a topic defined in configs. 
Then, run the application, and go to `http://localhost:8080/spaceships` with a sample body `{ "name": "Sputnik" }` to send some messages to the topic.

Notes:

- Configs for Kafka are located in `application.yaml`.
