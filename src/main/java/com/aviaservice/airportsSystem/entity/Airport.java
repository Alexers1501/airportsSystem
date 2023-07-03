package com.aviaservice.airportsSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Airport extends VersionedEntity{

    /*
    Буквенный код аэропорта
     */
    @Column(nullable = false)
    private String airportCode;

    private String country;

    private String city;

    private String name;

    private Double lon;

    private Double lat;

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
