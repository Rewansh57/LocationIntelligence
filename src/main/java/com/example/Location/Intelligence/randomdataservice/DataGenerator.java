package com.example.Location.Intelligence.randomdataservice;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class DataGenerator {


    public  SensorData getPM25(){
        SensorData pm25 = new SensorData();
        JsonValue jsonValue = new JsonValue();
        int index= ThreadLocalRandom.current().nextInt(0, 20);
        float value = ThreadLocalRandom.current().nextFloat() * 250;
        pm25.setValue(value);
        pm25.setLocationInfo(jsonValue.getSamples().get(index));

        return pm25;





    }







}
