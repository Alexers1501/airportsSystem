package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.Employee;
import com.aviaservice.airportsSystem.entity.Person;
import com.aviaservice.airportsSystem.dto.PersonDetails;
import com.aviaservice.airportsSystem.dto.RegistrationDto;
import com.aviaservice.airportsSystem.exception.ValidationException;
import com.aviaservice.airportsSystem.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PersonService<T extends Person> extends CrudService<T> implements IPersonService<T>{

    @Autowired
    private IPersonRepository personRepository;

    @Autowired
    private PersonDetailsContextService personDetailsContextService;

    protected T newPerson;

    @Override
    public IPersonRepository<T> getRepository() {
        return personRepository;
    }

    //TODO сделать абстрактным?
    public void setNewPerson(){ }

    @Override
    protected void validate(T entity) {

    }

    @Override
    public boolean register(RegistrationDto registrationDto) {

        newPerson.setLogin(registrationDto.getLogin());
        newPerson.setPassword(registrationDto.getPassword());
        getRepository().save(newPerson);

        PersonDetails personDetails = new PersonDetails();
        personDetails.setLogin(registrationDto.getLogin());
        personDetailsContextService.setPersonDetails(personDetails);

        return true;
    }

    @Override
    public boolean login(RegistrationDto authenticationDto) {

        Optional<Person> personData = Optional.ofNullable(getRepository().findByLogin(authenticationDto.getLogin()));
        if (personData.isPresent()){
            T person = (T) personData.get();

            if (person.getPassword().equals(authenticationDto.getPassword())){
                PersonDetails personDetails = new PersonDetails();
                personDetails.setLogin(person.getLogin());
                personDetailsContextService.setPersonDetails(personDetails);
                return true;
            }
        }
        throw new ValidationException("Неверно введен логин или пароль!");
    }
}
