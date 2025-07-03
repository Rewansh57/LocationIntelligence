package com.example.Location.Intelligence.common;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Transient;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable

public class LocationInfo {
    private String name;
    private String category;
    @Transient
    private double latitude;
    @Transient
    private double longitude;
}