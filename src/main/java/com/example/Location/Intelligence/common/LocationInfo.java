package com.example.Location.Intelligence.common;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationInfo {
    private String name;
    private String category;
    private double latitude;
    private double longitude;
}