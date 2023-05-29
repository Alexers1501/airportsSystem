package com.aviaservice.airportsSystem.dto;

import com.aviaservice.airportsSystem.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "flight")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Flight extends IdentifiableEntity{

    private String number;

    private Airport airport;

    private String departureTime;

    private String arrivalTime;

    private Aircraft aircraft;

    private String aviaCompany;

    private String route;

    public Flight() {
    }

}
