package com.example.Location.Intelligence.randomdataservice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@ToString
public class PM25 {





    public String sensorType="PM2.5";
    public float value;
    public String unit= "µg/m³";
    public String timeStamp= ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME).toString();
    public LocationInfo locationInfo;






}
