package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.Flight;
import com.aviaservice.airportsSystem.exception.ValidationException;
import com.aviaservice.airportsSystem.repository.IBaseRepository;
import com.aviaservice.airportsSystem.repository.ICrudRepository;
import com.aviaservice.airportsSystem.repository.IFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        if (entity.getNumber() == null){
            throw new ValidationException("Нельзя сохранять рейс без номера");
        }
    }

}
