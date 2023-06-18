package com.example.wfrphelper.model.mainClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "master")
@Component
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long master_id;
    private String login;
    private String password;
    @OneToMany(mappedBy = "playable_character_id")
    private List<PlayableCharacter> playableCharacters;

    public Master() {
    }

    public Master(long playerId, String login, String password, List<PlayableCharacter> playableCharacterList) {
        this.login = login;
        this.password = password;
        this.playableCharacters = playableCharacterList;
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

    public List<PlayableCharacter> getPlayersList() {
        return playableCharacters;
    }

    public void setPlayersList(List<PlayableCharacter> playersList) {
        this.playableCharacters = playersList;
    }
}
