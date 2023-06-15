package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.User;

import java.util.Optional;

public interface IUserService{

    User save(User user);

    Optional<User> getByLogin(String login);
}
