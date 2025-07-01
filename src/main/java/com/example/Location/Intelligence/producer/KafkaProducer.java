package com.example.Location.Intelligence.producer;

import com.example.Location.Intelligence.common.SensorData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public void sendPM25Data() throws JsonProcessingException {
        SensorData sensorData =dataGenerator.getPM25();

      kafkaTemplate.send(topicName, sensorData);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("Serialized JSON: " + mapper.writeValueAsString(sensorData));

        System.out.println("Sending PM25 data to " + sensorData.toString());


    }



}
