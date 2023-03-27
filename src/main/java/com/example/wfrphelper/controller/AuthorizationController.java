package com.example.wfrphelper.controller;

import com.example.wfrphelper.model.Wallet;
import com.example.wfrphelper.processors.AuthorizationProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorizationController {
    private final AuthorizationProcessor authorizationProcessor;

    public AuthorizationController(AuthorizationProcessor authorizationProcessor) {
        this.authorizationProcessor = authorizationProcessor;
    }

    @GetMapping("/authorization")
    public String authorizationGet() {
        return "authorization.html";
    }

    @PostMapping("/authorization")
    public String authorizationPost(@RequestParam String login, @RequestParam String password, Model model) {
        authorizationProcessor.setLogin(login);
        authorizationProcessor.setPassword(password);
        boolean loggedIn = authorizationProcessor.login();
        if (loggedIn) {
            return "home.html";
        } else {
            model.addAttribute("message", "Login failed!");
        }
        return "authorization.html";
    }
}

