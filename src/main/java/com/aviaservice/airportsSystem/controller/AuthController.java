package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.AuthRequest;
import com.aviaservice.airportsSystem.dto.AuthResponse;
import com.aviaservice.airportsSystem.dto.RegisterRequest;
import com.aviaservice.airportsSystem.service.IAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final IAuthService authService;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody @Validated RegisterRequest registerRequest){
        return authService.register(registerRequest);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody @Validated AuthRequest authRequest) {
        return authService.login(authRequest);
    }
}
