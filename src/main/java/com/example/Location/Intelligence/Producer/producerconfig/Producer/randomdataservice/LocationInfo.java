package com.example.Location.Intelligence.Producer.producerconfig.Producer.randomdataservice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public  class LocationInfo {
    public String name;
    public String category;
    public double latitude;
    public double longitude;


    public LocationInfo(String name, String category, double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.category = category;
    }
}