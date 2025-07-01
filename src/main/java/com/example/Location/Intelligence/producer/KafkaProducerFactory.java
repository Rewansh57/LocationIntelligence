package com.example.Location.Intelligence.producer;


import com.example.Location.Intelligence.common.SensorData;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration

public class KafkaProducerFactory {
    @Value("${spring.kafka.bootstrap-servers}")
    private String localServer;

   @Bean
    public ProducerFactory<String, SensorData> createProducerFactory() {
        Map<String, Object> config=new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,localServer);
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
       config.put(JsonSerializer.ADD_TYPE_INFO_HEADERS, false);

       return new DefaultKafkaProducerFactory<>(config);


    }
    @Bean
    public KafkaTemplate<String, SensorData>  kafkaTemplate() {
       return new KafkaTemplate<>(createProducerFactory());

    }

}
