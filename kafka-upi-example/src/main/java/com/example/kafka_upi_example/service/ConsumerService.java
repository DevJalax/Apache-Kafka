package com.example.kafka_upi_example.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "upi", groupId = "upi-consumer-group")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
