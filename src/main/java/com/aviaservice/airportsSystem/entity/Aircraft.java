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
public class Aircraft extends IdentifiableEntity{

    private String boardNumber;

    /*
    текущее расположение (аэропорт)
     */
    @ManyToOne
    private Airport currentAirport;

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
    @OneToMany(mappedBy = "aircraft")
    private List<Flight> flight;

}