package com.example.wfrphelper.DAO;

import com.example.wfrphelper.model.mainClasses.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PlayerDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Player> getAllPlayer(){
        String sql = "Select * From players";
        return jdbcTemplate.query(sql, new PlayerMapper());
    }

    private class PlayerMapper implements RowMapper<Player> {
        public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
            Player customer = new Player();
            customer.setPlayerId(rs.getInt("id"));
            customer.setLogin(rs.getString("login"));
            customer.setPassword(rs.getString("password"));
            return customer;
        }
    }
}
