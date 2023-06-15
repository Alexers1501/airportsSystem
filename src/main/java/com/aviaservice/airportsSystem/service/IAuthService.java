package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.AuthRequest;
import com.aviaservice.airportsSystem.dto.AuthResponse;
import com.aviaservice.airportsSystem.dto.RegisterRequest;

public interface IAuthService {

    AuthResponse register(RegisterRequest registerRequest);

    AuthResponse login(AuthRequest authRequest);
}
