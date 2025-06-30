package com.example.Location.Intelligence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class LocationIntelligence implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LocationIntelligence.class, args);



	}
	public void run (String... args) throws Exception {
		System.out.println("LocationIntelligence");

	}

}
