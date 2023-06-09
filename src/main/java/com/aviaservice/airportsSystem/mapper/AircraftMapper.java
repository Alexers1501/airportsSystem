package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.AircraftDto;
import com.aviaservice.airportsSystem.entity.Aircraft;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = AirportMapper.class)
public abstract class AircraftMapper implements IEntityMapper<Aircraft, AircraftDto>{

    @Override
    @Mapping(source = "dto.currentAirport", target = "currentAirport")
    public abstract Aircraft mapToEntity(AircraftDto dto);

    @Override
    @Mapping(source = "entity.currentAirport", target = "currentAirport")
    public abstract AircraftDto mapToDto(Aircraft entity);

}
