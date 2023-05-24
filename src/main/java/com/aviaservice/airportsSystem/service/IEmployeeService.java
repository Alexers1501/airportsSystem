package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Employee;

import java.util.List;

public interface IEmployeeService {

    Employee getById(Long id);
    void save(Employee employeeToSave);
    List<Employee> getAll();
}
