package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.BaseServiceConfiguration;
import com.aviaservice.airportsSystem.entity.Airport;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
@Transactional
public class AirportServiceIT extends BaseServiceConfiguration {

    @Autowired
    IAirportService airportService;

    @Test
    public void airportSave_Ok_Test(){
        Airport airport = new Airport();
        airport.setAirportCode("FOX");
        airport.setCountry("Country");
        airport.setCity("City");
        airport.setName("MyAirport");

        Airport savedAirport = airportService.save(airport);

        assertNotNull(savedAirport);
        assertNotNull(savedAirport.getId());

        savedAirport = airportService.getById(savedAirport.getId());

        assertEquals("FOX", savedAirport.getAirportCode());
    }
}
