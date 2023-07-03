package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.FlightDto;
import com.aviaservice.airportsSystem.dto.SearchFlightDto;
import com.aviaservice.airportsSystem.entity.Flight;
import com.aviaservice.airportsSystem.mapper.FlightMapper;
import com.aviaservice.airportsSystem.mapper.IEntityMapper;
import com.aviaservice.airportsSystem.service.ICrudService;
import com.aviaservice.airportsSystem.service.IFlightService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/flight")
public class FlightController extends CrudController<Flight, FlightDto> {

    private IFlightService flightService;

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
