package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.AircraftDto;
import com.aviaservice.airportsSystem.entity.Aircraft;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class AircraftMapper implements IEntityMapper<Aircraft, AircraftDto>{
    @Override
    public abstract Aircraft mapToEntity(AircraftDto dto);

    @Override
    public abstract AircraftDto mapToDto(Aircraft entity);
}
