//package com.aviaservice.airportsSystem.repository;
//
//import com.aviaservice.airportsSystem.dto.Employee;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class EmployeeRepository extends PersonRepository<Employee> implements IEmployeeRepository{
//
//    @Override
//    public List<Employee> findByOrganisationName(String organisation) {
//        List<Employee> searchList = new ArrayList<>();
//        for (Employee emp : database){
//            if (emp.getOrganisationName().equals(organisation)){
//                searchList.add(emp);
//            }
//        }
//        return searchList;
//    }
//
//}
