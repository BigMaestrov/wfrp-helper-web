package com.example.wfrphelper.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorizationController {
    @RequestMapping("/authorization")
    public String home(Model page) {
        page.addAttribute("login", "bigmaestro");
        page.addAttribute("password", "123");
        page.addAttribute("username", "Katy");
        page.addAttribute("color", "red");
        return "authorization.html";
    }
}
