//package com.aviaservice.airportsSystem.repository;
//
//import com.aviaservice.airportsSystem.dto.Person;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//
//@Repository
//public class PersonRepository<T extends Person> extends CrudRepository<T> implements IPersonRepository<T>{
//
//    public PersonRepository() {
//        super((Class<T>) Person.class);
//    }
//
//    @Override
//    public T findByLogin(String login) {
//        for (T person : database){
//            if (person.getLogin().equals(login)){
//                return person;
//            }
//        }
//
//        throw new RuntimeException("Пользователя не найден!");
//    }
//
//    @Override
//    RowMapper<T> getMapper() {
//        return null;
//    }
//}
