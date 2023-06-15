package com.aviaservice.airportsSystem.utils;

import com.aviaservice.airportsSystem.dto.UserDetails;
import com.aviaservice.airportsSystem.enums.Role;
import io.jsonwebtoken.Claims;

public class JwtUtils {

    public static UserDetails generate(Claims claims) {
        final UserDetails userDetails = new UserDetails();
        userDetails.setRole(Role.valueOf(claims.get("roles", String.class)));
        userDetails.setFirstName(claims.get("firstName", String.class));
        return userDetails;
    }
}
