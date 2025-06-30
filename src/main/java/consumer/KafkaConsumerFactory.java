package consumer;

import com.example.Location.Intelligence.Producer.producerconfig.Producer.randomdataservice.SensorData;

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

    @Value("${spring.kafka.consumer.groupid}")
    private String groupId;



   @Bean
    public ConsumerFactory<String,SensorData> createConsumer(){

        JsonDeserializer<SensorData> deserializer=new JsonDeserializer<SensorData>(SensorData.class);
       deserializer.setRemoveTypeHeaders(false);
       deserializer.addTrustedPackages("*");
       deserializer.setUseTypeHeaders(false);


        Map<String,Object> config=new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,kafkaServer);
        config.put(ConsumerConfig.GROUP_ID_CONFIG,groupId);
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,deserializer.getClass());



return new DefaultKafkaConsumerFactory<>(config,new StringDeserializer(),deserializer);


    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,SensorData>  createKafkaListenerContainerFactory(){
       ConcurrentKafkaListenerContainerFactory<String,SensorData> factory=new ConcurrentKafkaListenerContainerFactory<>();

       factory.setConsumerFactory(createConsumer());
       return factory;


    }





}
