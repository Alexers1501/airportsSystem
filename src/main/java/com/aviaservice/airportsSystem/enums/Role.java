package com.aviaservice.airportsSystem.enums;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public enum Role implements GrantedAuthority {

    ADMIN("ADMIN"),

    EMPLOYEE("EMPLOYEE"),

    BUYER("BUYER");

    private final String value;

    @Override
    public String getAuthority() {
        return value;
    }
}
