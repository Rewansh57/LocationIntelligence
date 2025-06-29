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

    @Getter
    @Setter
    @ToString
    public static class LocationInfo {
        public String name;
        public String category;

        public LocationInfo(String name, String category) {
            this.name = name;
            this.category = category;
        }
    }

    public String sensorType="PM2.5";
    public float value;
    public String unit= "µg/m³";
    public String timeStamp= ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME).toString();

    public List<LocationInfo> locationInfoList = Arrays.asList(
            new LocationInfo("Mumbai", "city"),
            new LocationInfo("Bengaluru", "city"),
            new LocationInfo("Kolkata", "city"),
            new LocationInfo("Delhi", "city"),
            new LocationInfo("Chennai", "city"),
            new LocationInfo("Pune", "city"),
            new LocationInfo("Hyderabad", "city"),
            new LocationInfo("Ahmedabad", "city"),
            new LocationInfo("Lucknow", "city"),
            new LocationInfo("Kanpur", "city"),

            new LocationInfo("Indore", "town"),
            new LocationInfo("Coimbatore", "town"),
            new LocationInfo("Surat", "town"),
            new LocationInfo("Nagpur", "town"),
            new LocationInfo("Jaipur", "town"),
            new LocationInfo("Bhopal", "town"),
            new LocationInfo("Patna", "town"),
            new LocationInfo("Vadodara", "town"),
            new LocationInfo("Lucknow", "town"),
            new LocationInfo("Visakhapatnam", "town"),

            new LocationInfo("Bhilai Industrial Area", "industrial area"),
            new LocationInfo("Tiruppur Industrial Area", "industrial area"),
            new LocationInfo("Noida Industrial Area", "industrial area"),
            new LocationInfo("Haldia Industrial Area", "industrial area"),
            new LocationInfo("Dharwad Industrial Area", "industrial area"),
            new LocationInfo("Bhiwadi Industrial Area", "industrial area"),
            new LocationInfo("Pithampur Industrial Area", "industrial area"),
            new LocationInfo("Pune MIDC", "industrial area"),
            new LocationInfo("Nashik Industrial Area", "industrial area"),
            new LocationInfo("Moradabad Industrial Area", "industrial area")
    );
}
