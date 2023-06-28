package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.Flight;

import java.time.LocalDate;
import java.util.List;

public interface IFlightService extends ICrudService<Flight>{

    List<Flight> getSearchFlightsByClient(String cityFrom, String cityTo,
                                         LocalDate departureDate, LocalDate arrivalDate, int passengersCount);
}
