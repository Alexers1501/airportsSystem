package com.aviaservice.airportsSystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class AuthRequest { //запрос на авторизацию

    @NotNull
    private String login;

    @NotNull
    private String password;
}
