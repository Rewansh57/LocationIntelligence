package com.example.Location.Intelligence.service;

import com.example.Location.Intelligence.dto.QueryResponseDto;
import com.example.Location.Intelligence.model.SensorDataEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LiveDataFetchingFromKafkaService {
    private SensorDataEntity sensorDataEntity;

    public List<QueryResponseDto>  getLiveSensorData(String sensor_type,String locationName){


    }






}
