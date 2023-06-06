package com.aviaservice.airportsSystem.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class Person extends IdentifiableEntity {

    private String login;
    private String Password;

    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String birthDate;
    private String email;


    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", Password='" + Password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
