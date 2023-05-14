package com.example.wfrphelper.services;

import com.example.wfrphelper.model.mainClasses.PlayableCharacter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MasterPageService {
/*
    //Хранилище игроков
    private static final Map<Integer, PlayableCharacter> PLAYER_REPOSITORY_MAP = new HashMap<>();

    public void create(PlayableCharacter playableCharacter) {
        PLAYER_REPOSITORY_MAP.put(null, playableCharacter);
    }

    public List<PlayableCharacter> readAll() {
        return new ArrayList<>(PLAYER_REPOSITORY_MAP.values());
    }

    public PlayableCharacter read(int id) {
        return PLAYER_REPOSITORY_MAP.get(id);
    }

    public boolean update(PlayableCharacter playableCharacter, int id) {
        if (PLAYER_REPOSITORY_MAP.containsKey(id)) {
            PLAYER_REPOSITORY_MAP.put(id, playableCharacter);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        return PLAYER_REPOSITORY_MAP.remove(id) != null;
    }*/
}