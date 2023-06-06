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
public class FlightDto extends IdentifiableEntityDto {

    private String number;

    private String airport;

    private String departureTime;

    private String arrivalTime;

    private String aircraft;

    private String aviaCompany;

    private String route;

    public FlightDto() {
    }

}
