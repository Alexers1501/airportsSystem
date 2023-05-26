package com.aviaservice.airportsSystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person extends IdentifiableEntity{

    private String login;
    private String Password;

    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String birthDate;


    @Override
    public String toString() {
        return "Person{" +
                "id='" + getId() + '\'' +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
