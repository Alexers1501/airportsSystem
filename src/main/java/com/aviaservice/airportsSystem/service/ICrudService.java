package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.dto.IdentifiableEntity;

import java.util.List;

public interface ICrudService<T extends IdentifiableEntity> {

    T save(T dto);

    T getById(Long id);

    T update(T dto);

    void delete(Long id);

    List<T> getAll();
}
