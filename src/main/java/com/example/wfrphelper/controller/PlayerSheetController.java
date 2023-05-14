package com.example.wfrphelper.controller;

import org.springframework.stereotype.Controller;

@Controller
public class PlayerSheetController {

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
