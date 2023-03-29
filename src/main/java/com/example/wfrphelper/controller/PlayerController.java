package com.example.wfrphelper.controller;

import com.example.wfrphelper.model.mainClasses.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.wfrphelper.services.PlayerService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping(value = "/players")
    public ResponseEntity<?> create(@RequestBody Player player) {
        playerService.create(player);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //Получение всех игроков
    @GetMapping(value = "/players")
    public String getPlayers(Model model) {
        List<Player> players = jdbcTemplate.query(
                "SELECT * FROM players",
                (rs, rowNum) -> new Player (
                        rs.getLong("id"),
                        rs.getString("login"),
                        rs.getString("password")
                )
        );
        model.addAttribute("players", players);
        return "players";
    }
    @PostMapping("/register")
    public String addPlayer(@RequestParam("login") String login,
                          @RequestParam("password") String password) {
        try (Connection conn = dataSource.getConnection()) {
            String sql = "INSERT INTO players (login, password) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (SQLException e) {
            // обработка ошибки
        }
        return "redirect:/players";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("player", new Player());
        return "register";
    }

    @PostMapping("/delete")
    public String addPlayer(@RequestParam("playerID") Long playerID) {
        try (Connection conn = dataSource.getConnection()) {
            String sql = "DELETE FROM players WHERE id = ?";
            jdbcTemplate.update(sql, playerID);
        } catch (SQLException e) {
            // обработка ошибки
        }
        return "redirect:/players";
    }

    @GetMapping("/delete")
    public String showDeleteForm(Model model) {
        model.addAttribute("player", new Player());
        return "delete";
    }

    @PostMapping("/redactor")
    public String redactorPlayer(@RequestParam("login") String login,
                                 @RequestParam("password") String password,
                                 @RequestParam("playerID") Long id) {
        System.out.println(1);
        try (Connection conn = dataSource.getConnection()) {
            String sql = "UPDATE players SET login = ?, password = ? WHERE id = ?";
            jdbcTemplate.update(sql, login, password, id);
        } catch (SQLException e) {
            // обработка ошибки
        }
        return "redirect:/players";
    }

    @GetMapping("/redactor")
    public String showRedactorForm(Model model) {
        model.addAttribute("player", new Player());
        return "redactor";
    }



    //Получение игрока
    @GetMapping(value = "/players/{id}")
    public ResponseEntity<Player> read(@PathVariable(name = "id") int id) {
        final Player client = playerService.read(id);

        return client != null
                ? new ResponseEntity<>(client, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/players/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Player player) {
        final boolean updated = playerService.update(player, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/players/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = playerService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}

