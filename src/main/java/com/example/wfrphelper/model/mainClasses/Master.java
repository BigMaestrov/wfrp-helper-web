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

    public Master() {
    }

    public Master(long playerId, String login, String password, List<Player> playersList) {
        this.login = login;
        this.password = password;
        this.playersList = playersList;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Player> playersList) {
        this.playersList = playersList;
    }
}
