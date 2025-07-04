package com.example.Location.Intelligence.common;

import org.locationtech.jts.geom.Point;

public class GeoJsonUtil {
    public static String toGeoJson(Point point) {
        if (point == null) return null;

        return String.format(
                "{\"type\":\"Point\",\"coordinates\":[%.6f, %.6f]}",
                point.getX(), point.getY()
        );
    }
}