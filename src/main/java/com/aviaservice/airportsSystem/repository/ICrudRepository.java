package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.dto.IdentifiableEntityDto;

import java.util.List;

public interface ICrudRepository<T extends IdentifiableEntityDto> {

    T save(T dto);

    T findById(Long id);

    T update(T dto);

    void delete(Long id);

    List<T> findAll();

}
