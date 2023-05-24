package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Employee;
import com.aviaservice.airportsSystem.repository.ICrudRepository;
import com.aviaservice.airportsSystem.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService extends CrudService<Employee> implements IEmployeeService{

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public ICrudRepository<Employee> getRepository() {
        return employeeRepository;
    }

}
