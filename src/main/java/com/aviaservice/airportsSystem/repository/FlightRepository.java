package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.mapper.FlightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightRepository extends CrudRepository<Flight> implements IFlightRepository{

    @Autowired
    private FlightMapper flightMapper;

    public FlightRepository() {
        super(Flight.class);
    }

    @Override
    RowMapper<Flight> getMapper() {
        return flightMapper;
    }
}
