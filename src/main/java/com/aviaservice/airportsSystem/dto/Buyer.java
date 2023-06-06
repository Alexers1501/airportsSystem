package com.aviaservice.airportsSystem.dto;

public class Buyer extends Person{

    public Buyer() {
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id='" + getId() + '\'' +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                '}';
    }

}
