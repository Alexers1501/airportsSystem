package com.aviaservice.airportsSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class FlightDto extends IdentifiableEntityDto {

    private String flightNumber;

    private String departureTime;

    private String arrivalTime;

    private String aviaCompany;

    private String route;

    private AircraftDto aircraft;

    /*
из какого аэропорта нахначен вылет
*/
    private AirportDto departureAirport;

    /*
    в какой аэропорт назначено прибытие
     */
    private AirportDto arrivalAirport;


}
