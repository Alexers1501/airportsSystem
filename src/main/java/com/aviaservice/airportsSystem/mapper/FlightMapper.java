package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.FlightDto;
import com.aviaservice.airportsSystem.entity.Flight;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses = {AirportMapper.class, AircraftMapper.class})
public abstract class FlightMapper implements IEntityMapper<Flight, FlightDto>{

    @Override
    @Mapping(source = "dto.departureAirport", target = "departureAirport")
    @Mapping(source = "dto.arrivalAirport", target = "arrivalAirport")
    @Mapping(source = "dto.aircraft", target = "aircraft")
    public abstract Flight mapToEntity(FlightDto dto);

    @Override
    @Mapping(source = "entity.departureAirport", target = "departureAirport")
    @Mapping(source = "entity.arrivalAirport", target = "arrivalAirport")
    @Mapping(source = "entity.aircraft", target = "aircraft")
    public abstract FlightDto mapToDto(Flight entity);
}
