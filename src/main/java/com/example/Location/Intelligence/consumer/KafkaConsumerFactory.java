package com.example.Location.Intelligence.consumer;

import com.example.Location.Intelligence.common.SensorData;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;
@Configuration
public class KafkaConsumerFactory {
    @Value("${spring.kafka.bootstrap-servers}")
    private String kafkaServer;

    @Value("${spring.kafka.consumers.groupid}")
    private String groupId;


    @Bean
    public ConsumerFactory<String, SensorData> createConsumer() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaServer);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        // Don't use VALUE_DESERIALIZER_CLASS_CONFIG here for JsonDeserializer

        JsonDeserializer<SensorData> deserializer = new JsonDeserializer<>(SensorData.class);
        deserializer.addTrustedPackages("com.example.Location.Intelligence.common");
        deserializer.setRemoveTypeHeaders(false);
        deserializer.setUseTypeMapperForKey(false);
        deserializer.setUseTypeHeaders(false);

        return new DefaultKafkaConsumerFactory<>(
                configProps,
                new StringDeserializer(),
                deserializer
        );
    }




    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,SensorData>  createKafkaListenerContainerFactory(){
       ConcurrentKafkaListenerContainerFactory<String,SensorData> factory=new ConcurrentKafkaListenerContainerFactory<>();

       factory.setConsumerFactory(createConsumer());
       return factory;


    }





}
