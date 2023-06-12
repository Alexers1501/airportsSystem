package com.aviaservice.airportsSystem.dto;

import com.aviaservice.airportsSystem.entity.Aircraft;
import com.aviaservice.airportsSystem.entity.Flight;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class AirportDto extends IdentifiableEntityDto{

    private String airportCode;

    private String country;

    private String city;

    private String name;

}
