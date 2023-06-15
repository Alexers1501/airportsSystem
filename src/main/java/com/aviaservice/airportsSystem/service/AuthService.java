package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.AuthRequest;
import com.aviaservice.airportsSystem.dto.AuthResponse;
import com.aviaservice.airportsSystem.dto.RegisterRequest;
import com.aviaservice.airportsSystem.entity.User;
import com.aviaservice.airportsSystem.enums.Role;
import com.aviaservice.airportsSystem.exception.AuthException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class AuthService implements IAuthService{

    private final UserService userService;

    private final JwtProvider jwtProvider;

    @Override
    public AuthResponse register(RegisterRequest registerRequest) {
        Optional<User> userOptional = userService.getByLogin(registerRequest.getLogin());

        if (userOptional.isPresent()){
            throw new AuthException("Пользователь с таким именем уже существует");
        }

        User user = User.builder()
                .role(Role.ADMIN)
                .login(registerRequest.getLogin())
                .password(registerRequest.getPassword())
                .firstName(registerRequest.getFirstName())
                .build();

        user = userService.save(user);

        final String accessToken = jwtProvider.generateAccessToken(user);
        return new AuthResponse(accessToken);
    }

    @Override
    public AuthResponse login(AuthRequest authRequest) {
        User user = userService.getByLogin(authRequest.getLogin())
                .orElseThrow(() -> new AuthException("Пользователь не найден"));

        if (user.getPassword().equals(authRequest.getPassword())){
            final String accessToken = jwtProvider.generateAccessToken(user);
            return new AuthResponse(accessToken);
        } else{
            throw new AuthException("Неправильный пароль");
        }
    }
}
