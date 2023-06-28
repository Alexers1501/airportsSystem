package com.aviaservice.airportsSystem.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class AirportDto extends VersionedDto {

    private String airportCode;

    private String country;

    private String city;

    private String name;

    private BigDecimal lon;

    private BigDecimal lat;

}
