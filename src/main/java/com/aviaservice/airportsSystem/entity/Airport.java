package com.aviaservice.airportsSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Airport extends IdentifiableEntity{

    /*
    Буквенный код аэропорта
     */
    private String airportCode;

    private String country;

    private String city;

    private String name;

    /*
    самолеты, находящиеся в данный момент в этом аэропорте
     */
    @OneToMany(mappedBy = "currentAirport", fetch = FetchType.EAGER)
    private List<Aircraft> aircraft;

    /*
    запланированные вылеты из данного аэропорта
     */
    @OneToMany(mappedBy = "departureAirport")
    private List<Flight> departureFlight;

    /*
    запланированные прилеты в данный аэропорт
     */
    @OneToMany(mappedBy = "arrivalAirport")
    private List<Flight> arrivalFlight;

}
