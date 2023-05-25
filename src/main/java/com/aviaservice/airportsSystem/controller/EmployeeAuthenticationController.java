package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.PersonDetails;
import com.aviaservice.airportsSystem.dto.RegistrationDto;
import com.aviaservice.airportsSystem.service.IEmployeeService;
import com.aviaservice.airportsSystem.service.PersonDetailsContextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeAuthenticationController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private PersonDetailsContextService personDetailsContextService;

    @PostMapping("/register")
    public boolean register(@RequestBody RegistrationDto registrationDto){
        return employeeService.register(registrationDto);
    }

    @GetMapping("/currentUser")
    public PersonDetails getCurrentUser(){
        return personDetailsContextService.getPersonDetails();
    }
}
