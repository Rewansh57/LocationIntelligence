package com.example.Location.Intelligence.Producer.producerconfig.Producer.randomdataservice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class KafkaProducer {

    @Value("${spring.kafka.topics.pm25}")
    private String topicName;

    private final KafkaTemplate<String, SensorData> kafkaTemplate;
    private final DataGenerator dataGenerator;


    @Scheduled(fixedRate=5000)
    public void sendPM25Data() {
        SensorData sensorData =dataGenerator.getPM25();

      kafkaTemplate.send(topicName, sensorData);
      System.out.println("Sending PM25 data to " + sensorData.toString());


    }



}
