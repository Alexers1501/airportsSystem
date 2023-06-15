package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.dto.UserDetails;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserDetailsContextService {

    private UserDetails userDetails;

    public UserDetails getPersonDetails() {
        return userDetails;
    }

    public void setPersonDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
