package com.example.Location.Intelligence.randomdataservice;

import lombok.Getter;


import java.util.Arrays;
import java.util.List;

@Getter

public class JsonValue {



    public List<LocationInfo> samples = Arrays.asList(
            new LocationInfo("Mumbai", "city", 19.0760, 72.8777),
            new LocationInfo("Bengaluru", "city", 12.9716, 77.5946),
            new LocationInfo("Kolkata", "city", 22.5726, 88.3639),
            new LocationInfo("Delhi", "city", 28.6139, 77.2090),
            new LocationInfo("Chennai", "city", 13.0827, 80.2707),
            new LocationInfo("Pune", "city", 18.5204, 73.8567),
            new LocationInfo("Hyderabad", "city", 17.3850, 78.4867),
            new LocationInfo("Ahmedabad", "city", 23.0225, 72.5714),
            new LocationInfo("Lucknow", "city", 26.8467, 80.9462),
            new LocationInfo("Kanpur", "city", 26.4499, 80.3319),

            new LocationInfo("Indore", "town", 22.7196, 75.8577),
            new LocationInfo("Coimbatore", "town", 11.0168, 76.9558),
            new LocationInfo("Surat", "town", 21.1702, 72.8311),
            new LocationInfo("Nagpur", "town", 21.1458, 79.0882),
            new LocationInfo("Jaipur", "town", 26.9124, 75.7873),
            new LocationInfo("Bhopal", "town", 23.2599, 77.4126),
            new LocationInfo("Patna", "town", 25.5941, 85.1376),
            new LocationInfo("Vadodara", "town", 22.3072, 73.1812),
            new LocationInfo("Lucknow", "town", 26.8467, 80.9462),
            new LocationInfo("Visakhapatnam", "town", 17.6868, 83.2185),

            new LocationInfo("Bhilai Industrial Area", "industrial area", 21.2092, 81.4285),
            new LocationInfo("Tiruppur Industrial Area", "industrial area", 11.1085, 77.3411),
            new LocationInfo("Noida Industrial Area", "industrial area", 28.5355, 77.3910),
            new LocationInfo("Haldia Industrial Area", "industrial area", 22.0620, 88.0698),
            new LocationInfo("Dharwad Industrial Area", "industrial area", 15.4589, 75.0078),
            new LocationInfo("Bhiwadi Industrial Area", "industrial area", 28.2100, 76.8606),
            new LocationInfo("Pithampur Industrial Area", "industrial area", 22.6110, 75.6217),
            new LocationInfo("Pune MIDC", "industrial area", 18.5802, 73.7387),
            new LocationInfo("Nashik Industrial Area", "industrial area", 19.9975, 73.7898),
            new LocationInfo("Moradabad Industrial Area", "industrial area", 28.8386, 78.7733)
    );
}
