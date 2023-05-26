package com.aviaservice.airportsSystem;

import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.service.FlightService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class AirportsSystemApplication {

	public static void main(String[] args) {

		ApplicationContext run = SpringApplication.run(AirportsSystemApplication.class, args);

	}

}
