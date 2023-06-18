package com.example.wfrphelper.controller;

import com.example.wfrphelper.model.mainClasses.Player;
import com.example.wfrphelper.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
public class RegistrationController {
    @Autowired
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
/*
    @PostMapping("/registration")
    public String addPlayer(@RequestParam("login") String login,
                            @RequestParam("password") String password,
                            @RequestParam(name = "is_master", defaultValue = "false") boolean is_master) {
        if(is_master){
            try (Connection conn = dataSource.getConnection()) {
                String sql = "INSERT INTO master (login, password) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, login);
                ps.setString(2, password);
                ps.executeUpdate();
            } catch (SQLException e) {
                System.err.println(e);
                return "redirect:/registrationFailed";
            }
        } else{
            try (Connection conn = dataSource.getConnection()) {
                String sql = "INSERT INTO player (login, password) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, login);
                ps.setString(2, password);
                ps.executeUpdate();
            } catch (SQLException e) {
                System.err.println(e);
                return "redirect:/registrationFailed";
            }
        }

        return "redirect:/authorization";
    }*/

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("player", new Player());
        return "registration";
    }

    @GetMapping("/registrationFailed")
    public String showRegistrationFailedForm(Model model) {
        model.addAttribute("player", new Player());
        return "registrationFailed";
    }
}
