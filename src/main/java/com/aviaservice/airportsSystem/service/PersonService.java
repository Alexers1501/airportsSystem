package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Person;
import com.aviaservice.airportsSystem.dto.RegistrationDto;
import com.aviaservice.airportsSystem.repository.ICrudRepository;
import com.aviaservice.airportsSystem.repository.IPersonRepository;

public class PersonService<T extends Person> extends CrudService<T> implements IPersonService<T>{

    private IPersonRepository personRepository;

    @Override
    public ICrudRepository<T> getRepository() {
        return personRepository;
    }

    @Override
    public boolean register(RegistrationDto registrationDto) {
        return false;
    }

    @Override
    public T login(RegistrationDto registrationDto) {
        return null;
    }
}
