package com.aviaservice.airportsSystem.dto;

import lombok.Data;

@Data
public class AirportDto extends VersionedDto {

    private String airportCode;

    private String country;

    private String city;

    private String name;

    private Double lon;

    private Double lat;

}
