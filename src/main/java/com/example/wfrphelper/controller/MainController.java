package com.example.wfrphelper.controller;

import com.example.wfrphelper.Services.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final ClientService clientService;

    public MainController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping("/home")
    public String home(@RequestParam(required = false) String Logout,Model model){
        if (Logout != null) {
            clientService.setUsername(null);
        }
        String login = clientService.getUsername();
        if (login == null) {
            return "redirect:/";
        }
        model.addAttribute("login" , login);
        return "home.html";
    }
}
