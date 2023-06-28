package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.Airport;
import com.aviaservice.airportsSystem.repository.IAirportRepository;
import com.aviaservice.airportsSystem.repository.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService extends CrudService<Airport> implements IAirportService{

    @Autowired
    IAirportRepository airportRepository;

    @Override
    public IBaseRepository<Airport> getRepository() {
        return airportRepository;
    }

    @Override
    protected void validate(Airport entity) {
        // todo
    }
}
