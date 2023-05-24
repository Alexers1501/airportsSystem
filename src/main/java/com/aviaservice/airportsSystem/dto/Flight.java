package com.aviaservice.airportsSystem.dto;

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

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public String getAviaCompany() {
        return aviaCompany;
    }

    public void setAviaCompany(String aviaCompany) {
        this.aviaCompany = aviaCompany;
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
