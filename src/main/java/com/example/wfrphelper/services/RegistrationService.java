package com.example.wfrphelper.services;

import com.example.wfrphelper.model.mainClasses.Player;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class RegistrationService {

    private String login;
    public String getUsername() {
        return login;
    }
    public void setUsername(String login) {
        this.login = login;
    }

    //Хранилище игроков
    private static final Map<Integer, Player> PLAYER_REPOSITORY_MAP = new HashMap<>();
    // Переменная для генерации ID кошелька
    private static final AtomicInteger WALLET_ID_HOLDER = new AtomicInteger();

    public void create(Player wallet) {
        final int playerId = WALLET_ID_HOLDER.incrementAndGet();
        wallet.setPlayerId(playerId);
        PLAYER_REPOSITORY_MAP.put(playerId, wallet);
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
    }
}
