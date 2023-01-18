package com.example.wfrphelper.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


@Service
@SessionScope
public class ClientService {

    private String login;

    public String getUsername() {
        return login;
    }

    public void setUsername(String login) {
        this.login = login;
    }
}
