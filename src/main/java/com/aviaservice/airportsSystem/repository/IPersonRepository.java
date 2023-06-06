package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.entity.Person;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IPersonRepository<T extends Person> extends IBaseRepository<T>{

    T findByLogin(String login);
}
