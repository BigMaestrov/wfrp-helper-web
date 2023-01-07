package com.example.wfrphelper.processors;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class AuthorizationProcessor {
    String login;
    String password;
    public boolean login() {
        String username = this.getLogin();
        String password = this.getPassword();
        if ("admin".equals(username) && "admin".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

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
