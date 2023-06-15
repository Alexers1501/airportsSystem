package com.aviaservice.airportsSystem.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Employee extends User {

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

}
