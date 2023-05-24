package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    public IFlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights(){
        return flightService.getAll();
    }

    @GetMapping("/{id}")
    public Flight getFLight(@PathVariable Long id){
        return flightService.getById(id);
    }

    @PostMapping
    public Flight save(@RequestBody Flight flight){
        return flightService.save(flight);
    }
}
