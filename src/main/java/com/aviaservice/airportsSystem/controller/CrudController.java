package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.dto.IdentifiableEntity;
import com.aviaservice.airportsSystem.service.ICrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CrudController<T extends IdentifiableEntity> {

    abstract ICrudService<T> getService();

    @GetMapping
    public List<T> getAll(){
        return getService().getAll();
    }

    @GetMapping("/{id}")
    public T get(@PathVariable Long id){
        return getService().getById(id);
    }

    @PostMapping
    public T save(@RequestBody T dto){
        return getService().save(dto);
    }

    @PutMapping
    public T update(@RequestBody T dto){
        return getService().update(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        getService().delete(id);
    }
}
