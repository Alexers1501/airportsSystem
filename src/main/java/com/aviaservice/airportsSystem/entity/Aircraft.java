package com.aviaservice.airportsSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class Aircraft extends VersionedEntity{

    private String boardNumber;

    /*
    текущее расположение (аэропорт)
     */
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "current_airport_id", referencedColumnName = "id", nullable = false)
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
