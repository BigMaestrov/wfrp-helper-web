package com.example.wfrphelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CharacterSheetController {

    @GetMapping("/characterSheet")
    public String showMasterPageForm() {
        return "characterSheet";
    }

    @PostMapping("/characterSheet")
    public String login() {
        return "redirect:/characterSheet";
    }
/*
    @GetMapping(value = "/playableCharacter{id}")
    public String playableCharacter(Model model, @PathVariable(name = "id") int id) {
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
}
