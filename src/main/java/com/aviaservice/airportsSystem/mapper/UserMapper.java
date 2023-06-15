package com.aviaservice.airportsSystem.mapper;

import com.aviaservice.airportsSystem.dto.UserDto;
import com.aviaservice.airportsSystem.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UserMapper implements IEntityMapper<User, UserDto> {

    @Override
    public abstract User mapToEntity(UserDto dto);

    @Override
    public abstract UserDto mapToDto(User entity);
}
