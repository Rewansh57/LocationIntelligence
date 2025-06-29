package com.example.Location.Intelligence.randomdataservice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public  class LocationInfo {
    public String name;
    public String category;

    public LocationInfo(String name, String category) {
        this.name = name;
        this.category = category;
    }
}