package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.FlightDto;
import com.aviaservice.airportsSystem.entity.Flight;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;


@Service
public class FlightMapper{

//    @Override
//    public FlightDto mapRow(ResultSet resultSet, int rowNum) throws SQLException {
//        FlightDto flightDto = new FlightDto();
//        flightDto.setId((long) resultSet.getInt("id"));
//        flightDto.setNumber(resultSet.getString("number"));
//        flightDto.setAviaCompany(resultSet.getString("aviacompany"));
//        return flightDto;
//    }

    public Flight mapToEntity(FlightDto dto){
        Flight entity = new Flight();
        entity.setId(dto.getId());
        entity.setNumber(dto.getNumber());
        entity.setAirport(dto.getAirport());
        entity.setDepartureTime(dto.getDepartureTime());
        entity.setArrivalTime(dto.getArrivalTime());
        entity.setAircraft(dto.getAircraft());
        entity.setAviaCompany(dto.getAviaCompany());
        entity.setRoute(dto.getRoute());

        return entity;

    }

    public FlightDto mapToDto(Flight entity){
        FlightDto dto = new FlightDto();
        dto.setId(dto.getId());
        dto.setNumber(dto.getNumber());
        dto.setAirport(dto.getAirport());
        dto.setDepartureTime(dto.getDepartureTime());
        dto.setArrivalTime(dto.getArrivalTime());
        dto.setAircraft(dto.getAircraft());
        dto.setAviaCompany(dto.getAviaCompany());
        dto.setRoute(dto.getRoute());

        return dto;

    }
}
