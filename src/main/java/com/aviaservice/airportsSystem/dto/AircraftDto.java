package com.aviaservice.airportsSystem.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@ToString
public class AircraftDto extends IdentifiableEntityDto {

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

    /*
  запланированные рейсы для данного самолета
 */
    private List<FlightDto> flight;



}
