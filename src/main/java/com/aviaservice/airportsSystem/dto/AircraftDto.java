package com.aviaservice.airportsSystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AircraftDto extends IdentifiableEntityDto {

    private String boardNumber;

    /*
    текущее расположение (аэропорт)
     */
    private AirportDto currentAirportDto;

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

    @Override
    public String toString() {
        return "Aircraft{" +
                "boardNumber='" + boardNumber + '\'' +
                ", currentAirport=" + currentAirportDto +
                ", maxFlightRange=" + maxFlightRange +
                ", boardCapacity=" + boardCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

}
