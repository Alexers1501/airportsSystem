package com.aviaservice.airportsSystem.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AircraftDto extends VersionedDto {

    private String boardNumber;

    /*
    текущее расположение (аэропорт)
     */
    private AirportDto currentAirport;

    /*
    максимальная дальность полета
     */
    private BigDecimal maxFlightRange;

    /*
    вместимость борта самолета
     */
    private int boardCapacity;

    /*
    расход топлива на 100 км
     */
    private BigDecimal fuelConsumption;



}
