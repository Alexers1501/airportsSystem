package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.AirportDto;
import com.aviaservice.airportsSystem.entity.Airport;
import com.aviaservice.airportsSystem.mapper.AirportMapper;
import com.aviaservice.airportsSystem.mapper.IEntityMapper;
import com.aviaservice.airportsSystem.service.IAirportService;
import com.aviaservice.airportsSystem.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airport")
public class AirportController extends CrudController<Airport, AirportDto>{

    @Autowired
    private IAirportService airportService;

    @Autowired
    private AirportMapper airportMapper;

    @Override
    ICrudService<Airport> getService() {
        return airportService;
    }

    @Override
    public IEntityMapper<Airport, AirportDto> getMapper() {
        return airportMapper;
    }
}
