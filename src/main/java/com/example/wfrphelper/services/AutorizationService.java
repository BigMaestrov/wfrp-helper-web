package com.example.wfrphelper.services;

import com.example.wfrphelper.model.mainClasses.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class AutorizationService {
    //Хранилище игроков
    private static final Map<Long, Player> PLAYER_REPOSITORY_MAP = new HashMap<>();

    public List<Player> readAll() {
        return new ArrayList<>(PLAYER_REPOSITORY_MAP.values());
    }

    public Player read(int id) {
        return PLAYER_REPOSITORY_MAP.get(id);
    }

    public boolean update(Player player, long id) {
        if (PLAYER_REPOSITORY_MAP.containsKey(id)) {
            player.setPlayerId(id);
            PLAYER_REPOSITORY_MAP.put(id, player);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        return PLAYER_REPOSITORY_MAP.remove(id) != null;
    }
}

