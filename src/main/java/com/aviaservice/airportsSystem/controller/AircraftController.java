package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.AircraftDto;
import com.aviaservice.airportsSystem.entity.Aircraft;
import com.aviaservice.airportsSystem.mapper.AircraftMapper;
import com.aviaservice.airportsSystem.mapper.IEntityMapper;
import com.aviaservice.airportsSystem.service.IAircraftService;
import com.aviaservice.airportsSystem.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aircraft")
public class AircraftController extends CrudController<Aircraft, AircraftDto>{

    @Autowired
    private IAircraftService aircraftService;

    @Autowired
    private AircraftMapper aircraftMapper;

    @Override
    ICrudService<Aircraft> getService() {
        return aircraftService;
    }

    @Override
    IEntityMapper<Aircraft, AircraftDto> getMapper() {
        return aircraftMapper;
    }
}
