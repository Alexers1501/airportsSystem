//package com.aviaservice.airportsSystem.repository;
//
//import com.aviaservice.airportsSystem.dto.FlightDto;
//import com.aviaservice.airportsSystem.mapper.FlightMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class FlightRepository extends CrudRepository<FlightDto> implements IFlightRepository{
//
//    @Autowired
//    private FlightMapper flightMapper;
//
//    public FlightRepository() {
//        super(FlightDto.class);
//    }
//
//    @Override
//    RowMapper<FlightDto> getMapper() {
//        return flightMapper;
//    }
//}
