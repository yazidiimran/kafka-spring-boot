package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "gfg_topic", groupId = "gfg_consumer_group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
