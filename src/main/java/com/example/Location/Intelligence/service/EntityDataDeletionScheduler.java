package com.example.Location.Intelligence.service;

import com.example.Location.Intelligence.repository.SensorDataEntityRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EntityDataDeletionScheduler {
    private final SensorDataEntityRepository sensorDateEntityRepository;

    @Scheduled(initialDelay = 60000, fixedDelay = 3600000)
    @Transactional
    public void deleteData() {
        LocalDateTime oneWeekAgo = LocalDateTime.now().minusWeeks(1);
        sensorDateEntityRepository.deleteOlderThan(oneWeekAgo);
    }

}
