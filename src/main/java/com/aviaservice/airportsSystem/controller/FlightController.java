package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.ErrorNotification;
import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.service.ICrudService;
import com.aviaservice.airportsSystem.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController extends CrudController<Flight> {

    @Autowired
    public IFlightService flightService;

    @Override
    ICrudService<Flight> getService() {
        return flightService;
    }
}
