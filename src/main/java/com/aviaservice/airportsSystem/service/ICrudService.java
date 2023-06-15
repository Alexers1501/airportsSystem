package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.IdentifiableEntity;
import com.aviaservice.airportsSystem.entity.VersionedEntity;

import java.util.List;

public interface ICrudService<T extends VersionedEntity> {

    T save(T dto);

    T getById(Long id);

    T update(T dto);

    void delete(Long id);

    List<T> getAll();
}
