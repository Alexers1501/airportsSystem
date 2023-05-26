package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Person;
import com.aviaservice.airportsSystem.dto.RegistrationDto;
import com.aviaservice.airportsSystem.repository.ICrudRepository;
import com.aviaservice.airportsSystem.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService<T extends Person> extends CrudService<T> implements IPersonService<T>{

    @Autowired
    private IPersonRepository personRepository;

    @Override
    public IPersonRepository<T> getRepository() {
        return personRepository;
    }

    @Override
    protected void validate(T dto) {

    }

    @Override
    public boolean register(RegistrationDto registrationDto) {
        return false;
    }

    @Override
    public T login(RegistrationDto authenticationDto) {
        return getRepository().findByLogin(authenticationDto.getLogin());
    }
}
