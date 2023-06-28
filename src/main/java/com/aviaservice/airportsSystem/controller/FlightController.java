package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.FlightDto;
import com.aviaservice.airportsSystem.dto.SearchFlightDto;
import com.aviaservice.airportsSystem.entity.Flight;
import com.aviaservice.airportsSystem.mapper.FlightMapper;
import com.aviaservice.airportsSystem.mapper.IEntityMapper;
import com.aviaservice.airportsSystem.service.ICrudService;
import com.aviaservice.airportsSystem.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/flight")
public class FlightController extends CrudController<Flight, FlightDto> {

    @Autowired
    private IFlightService flightService;

    @Autowired
    private FlightMapper flightMapper;

    @Override
    ICrudService<Flight> getService() {
        return flightService;
    }

    @Override
    public IEntityMapper<Flight, FlightDto> getMapper() {
        return flightMapper;
    }

    @PostMapping("/search")
    public List<FlightDto> searchFlightByParams(SearchFlightDto searchFlightDto){
        return null;
    }


}
