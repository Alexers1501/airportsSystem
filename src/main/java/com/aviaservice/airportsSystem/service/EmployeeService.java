//package com.aviaservice.airportsSystem.service;
//
//import com.aviaservice.airportsSystem.entity.Employee;
//import com.aviaservice.airportsSystem.dto.Person;
//import com.aviaservice.airportsSystem.dto.PersonDetails;
//import com.aviaservice.airportsSystem.dto.RegistrationDto;
//import com.aviaservice.airportsSystem.exception.ValidationException;
//import com.aviaservice.airportsSystem.repository.IEmployeeRepository;
//import com.aviaservice.airportsSystem.repository.IPersonRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EmployeeService extends PersonService<Employee> implements IEmployeeService{
//
//    @Autowired
//    private IEmployeeRepository employeeRepository;
//
//    @Autowired
//    private PersonDetailsContextService personDetailsContextService;
//
//    @Override
//    public IPersonRepository<Employee> getRepository() {
//        return employeeRepository;
//    }
//
//    @Override
//    public void setNewPerson() {
//        newPerson =  new Employee();
//    }
//
//    @Override
//    protected void validate(Employee entity) {
//
//    }
//
//
//}
