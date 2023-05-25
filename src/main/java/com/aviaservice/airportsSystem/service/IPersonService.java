package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Person;
import com.aviaservice.airportsSystem.dto.RegistrationDto;

public interface IPersonService<T extends Person> extends ICrudService<T> {



    boolean register(RegistrationDto registrationDto);

    T login(RegistrationDto authenticationDto);
}
