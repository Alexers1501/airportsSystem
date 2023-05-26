package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.annotation.Table;
import com.aviaservice.airportsSystem.dto.Flight;
import com.aviaservice.airportsSystem.dto.IdentifiableEntity;
import com.aviaservice.airportsSystem.exception.NotFoundException;
import com.aviaservice.airportsSystem.mapper.FlightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public abstract class CrudRepository<T extends IdentifiableEntity> implements ICrudRepository<T>{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    Class<T> classType;

    protected List<T> database = new ArrayList<>();

    private Long counterId = 1L;

    public CrudRepository(Class<T> classType) {
        this.classType = classType;
    }

    abstract RowMapper<T> getMapper();

    @Override
    public T save(T dto) {
        dto.setId(counterId);
        database.add(dto);
        counterId++;
        return dto;
    }

    @Override
    public T findById(Long id) {

        for (T dto : database){
            if (dto.getId() == id){
                return dto;
            }
        }
        throw new NotFoundException("Объект не найден!");
//
//        String sql = "select * from " +  getTableName() + " where id = ?";
//        return jdbcTemplate.queryForObject(sql, getMapper(), id);
    }


    @Override
    public T update(T dto) {
        //удаляет объект с тем же id, то есть сравнивает прежде чем удалить
        try {
            database.remove(dto);
            database.add(dto);
            return dto;
        }catch(RuntimeException e){
            throw new RuntimeException("Ошибка обновления!");
        }

    }

    @Override
    public void delete(Long id) {
        database.removeIf(dto -> dto.getId() == id);
    }

    public List<T> findAll(){
        return database;
    }

    private String getTableName(){
        Table annotation = classType.getAnnotation(Table.class);
        return annotation.name();
    }
}
