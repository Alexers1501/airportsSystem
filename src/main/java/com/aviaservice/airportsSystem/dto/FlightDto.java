package com.aviaservice.airportsSystem.dto;

import lombok.Data;

@Data
public class FlightDto extends VersionedDto {

    private String flightNumber;

    private String departureTime;

    private String arrivalTime;

    private String aviaCompany;

    private String route;

    private double distance;

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
