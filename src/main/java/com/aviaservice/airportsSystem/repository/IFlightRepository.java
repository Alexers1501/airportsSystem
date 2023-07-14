package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.entity.Flight;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface IFlightRepository extends IBaseRepository<Flight>{

    @Query(value = "SELECT flight FROM Flight flight " +
                    "JOIN flight.departureAirport a1 " +
                    "JOIN flight.arrivalAirport a2 " +
                    "WHERE a1.city=?1 AND a2.city=?2 AND flight.departureTime > CAST(?3 AS timestamp)")
    List<Flight> findSearchFlights(String cityFrom, String cityTo,
                                   LocalDate departureDate, int passengersCount);
}
