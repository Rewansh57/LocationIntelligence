package com.example.Location.Intelligence.dto;

import lombok.*;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor


public class QueryResponseDto {
    private String sensorType;
    private double value;
    private String unit;
    private String timeStamp;
    private String name;
    private String category;
    private String locationGeoJson;
    private double distance;

    public QueryResponseDto(String sensorType, double value, String unit, String timeStamp, String name, String category, String locationGeoJson, double distance) {
        this.sensorType = sensorType;
        this.value = value;
        this.unit = unit;
        this.timeStamp = timeStamp;
        this.name = name;
        this.category = category;
        this.locationGeoJson = locationGeoJson;
        this.distance = distance;
    }


}
