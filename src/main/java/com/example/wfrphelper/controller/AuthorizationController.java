package com.example.wfrphelper.controller;

import com.example.wfrphelper.model.mainClasses.Master;
import com.example.wfrphelper.model.mainClasses.Player;
import com.example.wfrphelper.processors.AuthorizationProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
public class AuthorizationController {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /*
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
    }*/


    @PostMapping("/authorization")
    public String login(@RequestParam("login") String login,
                            @RequestParam("password") String password) {

        //Авторизация для мастера
        try (Connection conn = dataSource.getConnection()) {
            String sql = "SELECT * FROM master WHERE login = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return "redirect:/masterPage";
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        //Авторизация для игрока
        try (Connection conn = dataSource.getConnection()) {
            String sql = "SELECT * FROM player WHERE login = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return "redirect:/playerSheet";
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return "redirect:/authorizationFailed";
    }

    @PostMapping("/authorization1")
    public String login() {
        return "redirect:/registration";
    }

/*
    @PostMapping("/authorization")
    public String login2(@RequestParam("login") String login,
                        @RequestParam("password") String password,
                        HttpSession session) {
        try (Connection conn = dataSource.getConnection()) {
            String sql = "SELECT is_master FROM users WHERE login = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                session.setAttribute("login", login);
                return "redirect:/home";
            } else {
                return "redirect:/authorizationFailed";
            }
        } catch (SQLException e) {
            System.err.println(e);
            return "redirect:/authorizationFailed";
        }
    }
*/
    @GetMapping("/authorization")
    public String showAuthorizationForm() {
        return "authorization";
    }

    @GetMapping("/authorizationFailed")
    public String showAuthorizationFailedForm() {
        return "authorizationFailed";
    }
}

