package com.example.kafka_upi_example.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(String message) {
		for (int i = 0; i < 100; i++) {
			kafkaTemplate.send("upi", message + " " + i);
		}
	}
}
