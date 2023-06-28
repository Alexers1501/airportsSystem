package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.Flight;
import com.aviaservice.airportsSystem.exception.ValidationException;
import com.aviaservice.airportsSystem.repository.IBaseRepository;
import com.aviaservice.airportsSystem.repository.IFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightService extends CrudService<Flight> implements IFlightService{

    @Autowired
    private IFlightRepository flightRepository;

    @Override
    public IBaseRepository<Flight> getRepository() {
        return flightRepository;
    }

    @Override
    protected void validate(Flight entity) {
        if (entity.getFlightNumber() == null){
            throw new ValidationException("Нельзя сохранять рейс без номера");
        }
    }

    @Override
    public List<Flight> getSearchFlightsByClient(String cityFrom, String cityTo, LocalDate departureDate, LocalDate arrivalDate, int passengersCount) {
        return null;
    }
}
