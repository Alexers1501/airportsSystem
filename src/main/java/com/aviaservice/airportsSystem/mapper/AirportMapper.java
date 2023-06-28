package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.AirportDto;
import com.aviaservice.airportsSystem.entity.Airport;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class AirportMapper implements IEntityMapper<Airport, AirportDto>{
}
