package com.aviaservice.airportsSystem.entity;

import com.aviaservice.airportsSystem.dto.Aircraft;
import com.aviaservice.airportsSystem.dto.Airport;
import com.aviaservice.airportsSystem.dto.IdentifiableEntityDto;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Flight extends IdentifiableEntity {

    private String number;

    private String airport;

    private String departureTime;

    private String arrivalTime;

    private String aircraft;

    private String aviaCompany;

    private String route;

}
