package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.repository.ICrudRepository;
import com.aviaservice.airportsSystem.repository.IFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService extends CrudService<Flight> implements IFlightService{

    @Autowired
    private IFlightRepository flightRepository;

    @Override
    public ICrudRepository<Flight> getRepository() {
        return flightRepository;
    }

}
