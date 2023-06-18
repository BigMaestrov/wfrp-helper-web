package com.example.wfrphelper.model.mainClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "player")
@Component
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long player_id;
    @Autowired
    private List<PlayableCharacter> playableCharactersList;
    private String login;
    private String password;

    public Player(long playerId, String login, String password) {
        this.player_id = playerId;
        this.login = login;
        this.password = password;
    }

    public Player() {
    }

    public long getPlayerId() {
        return player_id;
    }

    public void setPlayerId(Long playerId) {
        this.player_id = playerId;
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

