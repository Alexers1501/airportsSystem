package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.dto.IdentifiableEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class CrudRepository<T extends IdentifiableEntity> implements ICrudRepository<T>{

    protected List<T> database = new ArrayList<>();

    private Long counterId = 1L;

    @Override
    public T save(T dto) {
        dto.setId(counterId);
        database.add(dto);
        counterId++;
        return dto;
    }

    @Override
    public T findById(Long id) {
        for (T dto : database){
            if (dto.getId() == id){
                return dto;
            }
        }
        throw new RuntimeException("Объект не найден!");
    }


    @Override
    public T update(T dto) {
        //удаляет объект с тем же id, то есть сравнивает прежде чем удалить
        database.remove(dto);
        database.add(dto);
        return dto;
    }

    @Override
    public void delete(Long id) {
        database.removeIf(dto -> dto.getId() == id);
    }

    public List<T> findAll(){
        return database;
    }
}
