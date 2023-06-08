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

    /*
самолеты, находящиеся в данный момент в этом аэропорте
 */
    private List<AircraftDto> aircraft;

    /*
    запланированные вылеты из данного аэропорта
     */
    private List<FlightDto> departureFlight;

    /*
    запланированные прилеты в данный аэропорт
     */
    private List<FlightDto> arrivalFlight;
}
