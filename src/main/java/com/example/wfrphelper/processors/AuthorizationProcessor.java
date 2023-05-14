package com.example.wfrphelper.processors;

import com.example.wfrphelper.services.PlayerService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class AuthorizationProcessor {
    private String login;
    private String password;
    private final PlayerService playerService;

    public AuthorizationProcessor(PlayerService playerService) {
        this.playerService = playerService;
    }
/*
   public boolean login() {
        String username = this.getLogin();
        String password = this.getPassword();

        boolean loginResult = false;
        if ("admin".equals(username) && "admin".equals(password)) {
            loginResult = true;
            playerService.setUsername(username);
        }
        return loginResult;
    }*/

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
