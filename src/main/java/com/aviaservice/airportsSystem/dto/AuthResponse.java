package com.aviaservice.airportsSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse { // приходит на запрос авторизации или регистрации

    private String accessToken;
}
