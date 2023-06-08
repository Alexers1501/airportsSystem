package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.FlightDto;
import com.aviaservice.airportsSystem.entity.Flight;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public abstract class FlightMapper implements IEntityMapper<Flight, FlightDto>{

    @Override
    public abstract Flight mapToEntity(FlightDto dto);
    @Override
    public abstract FlightDto mapToDto(Flight entity);
}
