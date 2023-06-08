package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.Aircraft;
import com.aviaservice.airportsSystem.repository.IAircraftRepository;
import com.aviaservice.airportsSystem.repository.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService extends CrudService<Aircraft> implements IAircraftService{

    @Autowired
    private IAircraftRepository aircraftRepository;

    @Override
    public IBaseRepository<Aircraft> getRepository() {
        return aircraftRepository;
    }

    @Override
    protected void validate(Aircraft entity) {

    }
}
