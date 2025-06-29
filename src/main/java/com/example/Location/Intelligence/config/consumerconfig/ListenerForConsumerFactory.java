package com.example.Location.Intelligence.config.consumerconfig;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerForConsumerFactory {
    @KafkaListener(topics="topicName",groupId ="foo")
    public void ListenGroupFoo(String message){
        System.out.println("Received message in group :"+message);
    }
}
