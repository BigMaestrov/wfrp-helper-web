package com.example.wfrphelper.services;

import com.example.wfrphelper.model.mainClasses.Player;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class PlayerService {
/*
    //Хранилище игроков
    private static final Map<Integer, Player> PLAYER_REPOSITORY_MAP = new HashMap<>();

    public void create(Player player) {
        PLAYER_REPOSITORY_MAP.put(null, player);
    }

    public List<Player> readAll() {
        return new ArrayList<>(PLAYER_REPOSITORY_MAP.values());
    }

    public Player read(int id) {
        return PLAYER_REPOSITORY_MAP.get(id);
    }

    public boolean update(Player player, int id) {
        if (PLAYER_REPOSITORY_MAP.containsKey(id)) {
            player.setPlayerId(id);
            PLAYER_REPOSITORY_MAP.put(id, player);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        return PLAYER_REPOSITORY_MAP.remove(id) != null;
    }*/
}
