package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.dto.Person;

public interface IPersonRepository<T extends Person> extends ICrudRepository<T>{

    T findByLogin(String login);
}
