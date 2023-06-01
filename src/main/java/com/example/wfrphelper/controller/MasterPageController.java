package com.example.wfrphelper.controller;

import com.example.wfrphelper.model.mainClasses.PlayableCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

@Controller
public class MasterPageController {
   /* @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    int masterId;*/


    @PostMapping("/masterPage")
    public String login() {
        return "redirect:/characterSheet";
    }
    @GetMapping("/masterPage")
    public String showMasterPageForm() {
        return "masterPage";
    }
    /*
    //Получение всех игроков
    @GetMapping(value = "/masterPage{id}")
    public String getPlayers(Model model, @PathVariable(name = "id") int id) {
        List<PlayableCharacter> playableCharacters = jdbcTemplate.query(
                "SELECT * FROM playable_characters WHERE master_id = ?",
                (rs, rowNum) -> new PlayableCharacter (
                        rs.getInt(id),
                        rs.getString("login"),
                        rs.getString("password")
                )
        );
        model.addAttribute("characters", playableCharacters);
        return "characters";
    }*/

/*
    @GetMapping(value = "/masterPage{id}")
    public String getPlayers(Model model, @PathVariable(name = "id") int id) {
        String sql = "SELECT * FROM mytable WHERE id = ?";
        PreparedStatement pstmt = prepareStatement(sql);
        pstmt.setInt(1,id);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next())

        {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            // обработка данных
        }
        rs.close();
        pstmt.close();
        conn.close();
    }*/

    /*
    //Получение всех игроков
    @GetMapping(value = "/masterPage")
    public String getPlayers(Model model) {
        List<PlayableCharacter> playableCharacters = jdbcTemplate.query(
                "SELECT * FROM players",
                (rs, rowNum) -> new PlayableCharacter (
                        rs.getLong("id"),
                        rs.getString("login"),
                        rs.getString("password")
                )
        );
        model.addAttribute("players", playableCharacters);
        return "players";
    }*/
}
