package com.aviaservice.airportsSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Airport extends VersionedEntity{

    /*
    Буквенный код аэропорта
     */
    @Column(nullable = false)
    private String airportCode;

    private String country;

    private String city;

    private String name;

    private BigDecimal lon;

    private BigDecimal lat;

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
