package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.entity.User;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends IBaseRepository<User>{

    Optional<User> findByLogin(String login);
}
