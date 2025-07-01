package com.example.Location.Intelligence.consumer;


import com.example.Location.Intelligence.common.SensorData;
import lombok.RequiredArgsConstructor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ConsumerListener {
    @KafkaListener(topics = "${spring.kafka.topics.pm25}", groupId = "${spring.kafka.consumers.groupid}")
    public void getData(SensorData sensorData) {
        System.out.println("Received Sensor Data: " + sensorData);
    }
}