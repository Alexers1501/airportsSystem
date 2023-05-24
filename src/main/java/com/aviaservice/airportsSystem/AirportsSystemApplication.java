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
		FlightService flightService = (FlightService) run.getBean("flightService");

		Flight flight1 = new Flight("RX-1243", "12.05.2023",
				"Aeroflot", "Moscow-Sochi");
		Flight flight2 = new Flight("RT-1903", "10.05.2023",
				"SmartAvia", "Ekaterinburg-Moscow");

		flightService.save(flight1);
		flightService.save(flight2);

		List<Flight> flights = flightService.getAll();
		flights.forEach(flight -> System.out.println(flight));
		System.out.println();
		System.out.println(flightService.getById(1L));
	}

}
