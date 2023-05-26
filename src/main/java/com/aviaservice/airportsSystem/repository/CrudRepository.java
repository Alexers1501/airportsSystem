package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.dto.IdentifiableEntity;
import com.aviaservice.airportsSystem.mapper.FlightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public abstract class CrudRepository<T extends IdentifiableEntity> implements ICrudRepository<T>{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private FlightMapper flightMapper;

    protected List<T> database = new ArrayList<>();

    private Long counterId = 1L;

    @Override
    public T save(T dto) {
        dto.setId(counterId);
        database.add(dto);
        counterId++;
        return dto;
    }

    @Override
    public T findById(Long id) {
//        for (T dto : database){
//            if (dto.getId() == id){
//                return dto;
//            }
//        }
//        throw new RuntimeException("Объект не найден!");

        String sql = "select id, number, aviacompany from flight where id=1";
        List<Flight> query = jdbcTemplate.query(sql, flightMapper);
        System.out.println(query);
        return null;
    }


    @Override
    public T update(T dto) {
        //удаляет объект с тем же id, то есть сравнивает прежде чем удалить
        database.remove(dto);
        database.add(dto);
        return dto;
    }

    @Override
    public void delete(Long id) {
        database.removeIf(dto -> dto.getId() == id);
    }

    public List<T> findAll(){
        return database;
    }
}
