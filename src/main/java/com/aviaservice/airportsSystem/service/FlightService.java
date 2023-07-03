package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.Airport;
import com.aviaservice.airportsSystem.entity.Flight;
import com.aviaservice.airportsSystem.exception.ValidationException;
import com.aviaservice.airportsSystem.repository.IBaseRepository;
import com.aviaservice.airportsSystem.repository.IFlightRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static java.lang.Math.*;

@Service
@AllArgsConstructor
public class FlightService extends CrudService<Flight> implements IFlightService{

    private IFlightRepository flightRepository;

    private IAirportService airportService;

    @Override
    public IBaseRepository<Flight> getRepository() {
        return flightRepository;
    }

    @Override
    protected void validate(Flight entity) {
        if (entity.getFlightNumber() == null){
            throw new ValidationException("Нельзя сохранять рейс без номера");
        }
    }

    @Override
    public Flight save(Flight entity) {
        Airport departureAirport = airportService.getById(entity.getDepartureAirport().getId());
        Airport arrivalAirport = airportService.getById(entity.getArrivalAirport().getId());
        Double distance = calculateDistance(departureAirport.getLat(), departureAirport.getLon(),
                arrivalAirport.getLat(), arrivalAirport.getLon());
        entity.setDistance(distance);

        return super.save(entity);
    }

    @Override
    public List<Flight> getSearchFlightsByClient(String cityFrom, String cityTo, LocalDate departureDate, LocalDate arrivalDate, int passengersCount) {
        return null;
    }

    private Double calculateDistance(Double depLat, Double depLon,
                                     Double arLat, Double arLon){
        final Double earth_radius = 6371.0;

        final Double dLon = deg2rad(depLon - arLon);
        final Double dLat = deg2rad(depLat - arLat);
        final Double a = sin(dLat / 2) * sin(dLat / 2) + cos(deg2rad(arLat)) *
                cos(deg2rad(depLat)) * sin(dLon / 2) * sin(dLon / 2);
        final Double c = 2 * atan2(sqrt(a), sqrt(1 - a));

        return c * earth_radius;
    }

    private double deg2rad(final Double degree){
        return degree * (Math.PI / 180);
    }
}
