package com.example.Location.Intelligence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class MessageService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topicName,String message){
        CompletableFuture<SendResult<String,String >> future=kafkaTemplate.send(topicName,message );

        //Provides us confirmation that the data was sent
        future.whenComplete((result,exception)->{
            if(exception==null){
                System.out.println("Sent message:"+message +result.getRecordMetadata().offset());

            }
            else {
                System.out.println("Failed to send message :"+message+exception.getMessage());
            }
        });


    }
}
