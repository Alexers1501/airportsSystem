package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.IdentifiableEntityDto;
import com.aviaservice.airportsSystem.entity.IdentifiableEntity;
import com.aviaservice.airportsSystem.mapper.IEntityMapper;
import com.aviaservice.airportsSystem.service.ICrudService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CrudController<E extends IdentifiableEntity, D extends IdentifiableEntityDto> {

    abstract ICrudService<E> getService();

    abstract IEntityMapper<E, D> getMapper();

    @GetMapping
    public List<D> getAll(){
        List<D> dtoList = new ArrayList<>();
        dtoList = getService().getAll().stream().map(e -> getMapper().mapToDto(e)).collect(Collectors.toList());
        return dtoList;
    }

    @GetMapping("/{id}")
    public D get(@PathVariable Long id){
        E entity = getService().getById(id);
        return getMapper().mapToDto(entity);
    }

    @PostMapping
    public D save(@RequestBody D dto){
        E entity = getMapper().mapToEntity(dto);
        entity = getService().save(entity);
        return getMapper().mapToDto(entity);
    }

    @PutMapping
    public D update(@RequestBody D dto){
        E entity = getMapper().mapToEntity(dto);
        entity = getService().update(entity);
        return getMapper().mapToDto(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        getService().delete(id);
    }
}
