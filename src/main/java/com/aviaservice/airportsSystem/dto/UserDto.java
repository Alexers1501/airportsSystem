package com.aviaservice.airportsSystem.dto;

import com.aviaservice.airportsSystem.enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends VersionedDto {

    private String firstName;

    private String login;

    private String Password;

    private Role role;
}
