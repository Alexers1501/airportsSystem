package com.aviaservice.airportsSystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegisterRequest { //запрос на регистрацию

    @NotNull
    private String firstName;

    @NotNull
    private String login;

    @NotNull
    private String password;
}
