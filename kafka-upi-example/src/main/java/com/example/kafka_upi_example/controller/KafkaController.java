package com.example.kafka_upi_example.controller;

import com.example.kafka_upi_example.service.ProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final ProducerService producerService;

    public KafkaController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestParam String message) {
        producerService.sendMessage(message);
    }
}
