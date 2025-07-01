package com.example.Location.Intelligence.common;

import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable

public class LocationInfo {
    private String name;
    private String category;
    private double latitude;
    private double longitude;
}