package com.example.wfrphelper.model.mainClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Master {
    private String login;
    private String password;
    @Autowired
    private List<Player> playersList;
}