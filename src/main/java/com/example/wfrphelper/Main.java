package com.example.wfrphelper;

import com.example.wfrphelper.model.Item;
import com.example.wfrphelper.model.Items;
import com.example.wfrphelper.model.Wallet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class Main {
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/wfrp";
    static final String USER = "root";
    static final String PASS = "123";

    public static void main(String[] args) {
        System.out.println("Testing connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;

        try {connection = DriverManager.getConnection(DB_URL, USER, PASS); Statement statement = connection.createStatement();
            //statement.execute("INSERT INTO masters VALUES (3, 1, 'login1', 'password1'), (4, 2, 'login2', 'password2');");


        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }
        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }
        SpringApplication.run(Main.class, args);
    }
}

