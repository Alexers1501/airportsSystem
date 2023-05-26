package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Employee;
import com.aviaservice.airportsSystem.dto.PersonDetails;
import com.aviaservice.airportsSystem.dto.RegistrationDto;
import com.aviaservice.airportsSystem.repository.IEmployeeRepository;
import com.aviaservice.airportsSystem.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends PersonService<Employee> implements IEmployeeService{

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Autowired
    private PersonDetailsContextService personDetailsContextService;

    @Override
    public IPersonRepository<Employee> getRepository() {
        return employeeRepository;
    }

    @Override
    protected void validate(Employee dto) {

    }

    @Override
    public boolean register(RegistrationDto registrationDto) {

        Employee emp = new Employee();
        emp.setLogin(registrationDto.getLogin());
        emp.setPassword(registrationDto.getPassword());
        employeeRepository.save(emp);

        PersonDetails personDetails = new PersonDetails();
        personDetails.setLogin(registrationDto.getLogin());
        personDetailsContextService.setPersonDetails(personDetails);

        return true;
    }

    @Override
    public Employee login(RegistrationDto authenticationDto) {
        return employeeRepository.findByLogin(authenticationDto.getLogin());
    }
}
