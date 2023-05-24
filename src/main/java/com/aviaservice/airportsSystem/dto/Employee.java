package com.aviaservice.airportsSystem.dto;

import java.time.LocalDate;

public class Employee extends Person {

    private String position;

    private String organisationName;

    //дата трудоустройства
    private LocalDate hireDate;

    public Employee() {
    }

    public Employee(String position, LocalDate hireDate, String organisationName) {
        this.position = position;
        this.hireDate = hireDate;
        this.organisationName = organisationName;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + getId() + '\'' +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                '}';
    }
}
