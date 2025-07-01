package com.example.Location.Intelligence.model;

import com.example.Location.Intelligence.common.LocationInfo;
import com.example.Location.Intelligence.common.SensorData;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sensor_data_entity", schema = "public")

@Getter
@Setter
@ToString


public class SensorDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String sensorType;
    private float value;
    private String unit;


    private String timeStamp;

    @Embedded
    private LocationInfo locationInfo;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public SensorDataEntity(SensorData sensorData) {
        this.sensorType = sensorData.getSensorType();
        this.value = sensorData.getValue();
        this.unit = sensorData.getUnit();
        this.timeStamp = sensorData.getTimeStamp();
        this.locationInfo = sensorData.getLocationInfo();


    }


}
