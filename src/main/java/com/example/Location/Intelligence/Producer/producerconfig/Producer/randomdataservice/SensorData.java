package com.example.Location.Intelligence.Producer.producerconfig.Producer.randomdataservice;

import lombok.*;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class SensorData {





    public String sensorType="PM2.5";
    public float value;
    public String unit= "µg/m³";
    public String timeStamp= ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME).toString();
    public LocationInfo locationInfo;






}
