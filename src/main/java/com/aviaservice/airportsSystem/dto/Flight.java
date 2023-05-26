package com.aviaservice.airportsSystem.dto;

import com.aviaservice.airportsSystem.annotation.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "flight")
@Getter
@Setter
public class Flight extends IdentifiableEntity{

    private String number;

    private String dateOfFlight;

    private String aviaCompany;

    private String route;

    public Flight() {
    }

    public Flight(String number, String dateOfFlight, String aviaCompany, String route) {
        this.number = number;
        this.dateOfFlight = dateOfFlight;
        this.aviaCompany = aviaCompany;
        this.route = route;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number='" + number + '\'' +
                ", dateOfFlight='" + dateOfFlight + '\'' +
                ", aviaCompany='" + aviaCompany + '\'' +
                ", route='" + route + '\'' +
                '}';
    }
}
