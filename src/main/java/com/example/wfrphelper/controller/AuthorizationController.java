package com.example.wfrphelper.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizationController {
    @RequestMapping("/authorization/{color}")
    public String home(@PathVariable String color, Model page) {
        page.addAttribute("login", "bigmaestro");
        page.addAttribute("password", "123");
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color);
        return "authorization.html";
    }
}
