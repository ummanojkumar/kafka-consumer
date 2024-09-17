package com.manoj.service;

import com.manoj.kafka_producer.model.Customer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "mca3", groupId = "mca-group1")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "mca5", groupId = "mca-group5")
    public void consumeCustomer(Customer customer) {
        System.out.println("Consumed message: " + customer.toString());
    }
}
