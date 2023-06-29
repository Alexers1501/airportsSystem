package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.AirportDto;
import com.aviaservice.airportsSystem.dto.CoordsDto;
import com.aviaservice.airportsSystem.entity.Airport;
import com.aviaservice.airportsSystem.mapper.AirportMapper;
import com.aviaservice.airportsSystem.mapper.IEntityMapper;
import com.aviaservice.airportsSystem.service.IAirportService;
import com.aviaservice.airportsSystem.service.ICrudService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

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

    @Override
    public AirportDto save(AirportDto dto) {
        Airport entity = getMapper().mapToEntity(dto);

        entity = getService().save(entity);
        return getMapper().mapToDto(entity);
    }

}
