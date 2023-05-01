package com.example.wfrphelper.controller;

import com.example.wfrphelper.model.mainClasses.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CharacterListController {
    @GetMapping("/characterList")
    public String showRegistrationForm() {
        return "characterList";
    }
}
