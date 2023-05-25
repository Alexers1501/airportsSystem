package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.dto.Employee;

import java.util.List;

public interface IEmployeeRepository extends IPersonRepository<Employee>{

    List<Employee> findByOrganisationName(String organisation);
}
