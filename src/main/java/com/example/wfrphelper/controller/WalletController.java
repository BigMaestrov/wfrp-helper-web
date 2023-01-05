package com.example.wfrphelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WalletController {

    @GetMapping("/wallet")
    public String home() {
        return "home.html";
    }
}

