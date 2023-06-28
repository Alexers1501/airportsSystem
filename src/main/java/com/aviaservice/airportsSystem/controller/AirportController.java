package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.AirportDto;
import com.aviaservice.airportsSystem.entity.Airport;
import com.aviaservice.airportsSystem.mapper.AirportMapper;
import com.aviaservice.airportsSystem.mapper.IEntityMapper;
import com.aviaservice.airportsSystem.service.IAirportService;
import com.aviaservice.airportsSystem.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @GetMapping("/test_geopify")
    public Object getTest(){
        String url = "https://api.geoapify.com/v1/geocode/search?text=аэропорт%20Кольцово%20SVX&name=Кольцово&city=Екатеринбург&limit=1&lang=ru&format=json&apiKey=d840eae270f54bdf8d7501f77219a54c";
        RestTemplate restTemplate = new RestTemplate();

        Object test = restTemplate.getForObject(url, Object.class);

        return test;
    }
}
