package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Flight;

import java.util.List;

public interface IFlightService {

    Flight get(Long id);

    void save(Flight flightToSave);

    List<Flight> getAll();
}
