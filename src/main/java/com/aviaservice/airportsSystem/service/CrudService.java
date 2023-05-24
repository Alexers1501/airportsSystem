package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.dto.IdentifiableEntity;
import com.aviaservice.airportsSystem.repository.ICrudRepository;

import java.util.List;

public abstract class CrudService<T extends IdentifiableEntity> implements ICrudService<T>{

    public abstract ICrudRepository<T> getRepository();

    @Override
    public T save(T dto) {
        return getRepository().save(dto);
    }

    @Override
    public T getById(Long id) {
        return (T) getRepository().findById(id);
    }

    @Override
    public T update(T dto) {
        return (T) getRepository().update(dto);
    }

    @Override
    public void delete(Long id) {
        getRepository().delete(id);
    }

    @Override
    public List<T> getAll() {
        return getRepository().findAll();
    }
}
