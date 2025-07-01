package com.example.Location.Intelligence.consumer;


import com.example.Location.Intelligence.common.SensorData;
import com.example.Location.Intelligence.model.SensorDataEntity;
import com.example.Location.Intelligence.repository.SensorDataEntityRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ConsumerListener {
    private final SensorDataEntityRepository sensorDataEntityRepository;


    @KafkaListener(topics = "${spring.kafka.topics.pm25}", groupId = "${spring.kafka.consumers.groupid}")
    public void getData(SensorData sensorData) {
        SensorDataEntity sensorDataEntity =new SensorDataEntity(sensorData);
        sensorDataEntityRepository.save(sensorDataEntity);



        System.out.println("DataSaved");



    }
}