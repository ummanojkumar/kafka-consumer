package com.manoj.kafka_consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "mca3", groupId = "mca-group1")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
