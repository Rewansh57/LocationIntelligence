package com.example.Location.Intelligence.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerStarter implements ApplicationListener<ApplicationReadyEvent> {

    private final KafkaListenerEndpointRegistry registry;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        // Optional delay (e.g. let Hibernate create schema)
        try {
            Thread.sleep(8000); // 8 seconds, tweak if needed
        } catch (InterruptedException ignored) {
        }

        registry.getListenerContainers().forEach(container -> {
            container.start();
        });
    }
}
