package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.Flight;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;


@Service
public class FlightMapper implements RowMapper<Flight> {

    @Override
    public Flight mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Flight flight = new Flight();
        flight.setId((long) resultSet.getInt("id"));
        flight.setNumber(resultSet.getString("number"));
        flight.setAviaCompany(resultSet.getString("aviacompany"));
        return flight;
    }
}
