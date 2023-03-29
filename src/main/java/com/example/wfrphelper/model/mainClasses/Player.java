package com.example.wfrphelper.model.mainClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Player {
    private long playerId;
    @Autowired
    private List<PlayableCharacter> playableCharactersList;
    private String login;
    private String password;

    public Player(long playerId, String login, String password) {
        this.playerId = playerId;
        this.login = login;
        this.password = password;
    }

    public Player() {
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public List<PlayableCharacter> getPlayableCharactersList() {
        return playableCharactersList;
    }

    public void setPlayableCharactersList(List<PlayableCharacter> playableCharactersList) {
        this.playableCharactersList = playableCharactersList;
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
}

