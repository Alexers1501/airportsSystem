package com.aviaservice.airportsSystem.entity;

import com.aviaservice.airportsSystem.enums.Role;
import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends VersionedEntity {

    private String firstName;

    private String login;

    private String password;

    private Role role = Role.ADMIN;


}
