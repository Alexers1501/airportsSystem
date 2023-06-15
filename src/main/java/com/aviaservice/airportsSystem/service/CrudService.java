package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.IdentifiableEntity;
import com.aviaservice.airportsSystem.entity.VersionedEntity;
import com.aviaservice.airportsSystem.exception.NotFoundException;
import com.aviaservice.airportsSystem.repository.IBaseRepository;

import java.util.List;

public abstract class CrudService<E extends VersionedEntity> implements ICrudService<E>{

    public abstract IBaseRepository<E> getRepository();

    protected abstract void validate(E entity);

    @Override
    public E save(E entity) {
        if (entity.getId() != null){
            throw new RuntimeException("Ошибка сохранения!");
        }

        validate(entity);
        return getRepository().save(entity);
    }

    @Override
    public E getById(Long id) {
        return getRepository().findById(id).orElseThrow(() -> new NotFoundException("объект не найден"));
    }

    @Override
    public E update(E entity) {
        if (entity.getId() == null){
            throw new RuntimeException("Ошибка обновления");
        }
        return getRepository().save(entity);
    }

    @Override
    public void delete(Long id) {
        getRepository().deleteById(id);
    }

    @Override
    public List<E> getAll() {
        return (List<E>) getRepository().findAll();
    }
}
