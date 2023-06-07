package com.aviaservice.airportsSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Flight extends IdentifiableEntity {

    /*
    номер рейса
     */
    @Column(name = "flight_number")
    private String flightNumber;

    /*
    из какого аэропорта нахначен вылет
     */
    @ManyToOne
    private Airport departureAirport;

    /*
    в какой аэропорт назначено прибытие
     */
    @ManyToOne
    private Airport arrivalAirport;

    /*
    время вылета
     */
    @Column(name = "departure_time")
    private LocalDateTime departureTime;

    /*
    время прибытия
     */
    @Column(name = "arrival_time")
    private LocalDateTime arrivalTime;

    /*
    самлет, назначенный на данный рейс
     */
    @ManyToOne
    private Aircraft aircraft;

    @Column(name = "avia_company")
    private String aviaCompany;

    private String route;

}
