package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.AircraftDto;
import com.aviaservice.airportsSystem.entity.Aircraft;
import com.aviaservice.airportsSystem.mapper.AircraftMapper;
import com.aviaservice.airportsSystem.mapper.IEntityMapper;
import com.aviaservice.airportsSystem.service.IAircraftService;
import com.aviaservice.airportsSystem.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/aircraft")
public class AircraftController extends CrudController<Aircraft, AircraftDto>{

    private IAircraftService aircraftService;

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
