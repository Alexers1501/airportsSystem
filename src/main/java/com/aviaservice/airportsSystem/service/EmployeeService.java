package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Employee;
import com.aviaservice.airportsSystem.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    
    private final IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employeeToSave) {
        employeeRepository.save(employeeToSave);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
