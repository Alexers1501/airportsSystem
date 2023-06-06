package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.FlightDto;
import com.aviaservice.airportsSystem.entity.Flight;
import com.aviaservice.airportsSystem.mapper.FlightMapper;
import com.aviaservice.airportsSystem.service.ICrudService;
import com.aviaservice.airportsSystem.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/flight")
public class FlightController extends CrudController<Flight> {

    @Autowired
    public IFlightService flightService;

    @Autowired
    public FlightMapper flightMapper;

    @Override
    ICrudService<Flight> getService() {
        return flightService;
    }

    @GetMapping("/{id}")
    public FlightDto get(Long id) {
        Flight entity = flightService.getById(id);
        return flightMapper.mapToDto(entity);
    }

    @GetMapping
    public List<FlightDto> getAll(){
        return getService().getAll().stream().map(e -> flightMapper.mapToDto(e)).collect(Collectors.toList());
    }

    @PostMapping
    public FlightDto save(@RequestBody FlightDto dto){
        Flight entity = flightMapper.mapToEntity(dto);
        entity = getService().save(entity);
        dto = flightMapper.mapToDto(entity);
        return dto;
    }

    @PutMapping
    public FlightDto update(@RequestBody FlightDto dto){
        Flight entity = flightMapper.mapToEntity(dto);
        entity = getService().save(entity);
        dto = flightMapper.mapToDto(entity);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        getService().delete(id);
    }
}
