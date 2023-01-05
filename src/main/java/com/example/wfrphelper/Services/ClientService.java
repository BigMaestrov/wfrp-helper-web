package com.example.wfrphelper.Services;

import com.example.wfrphelper.model.PlayableCharacter;
import com.example.wfrphelper.model.Wallet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClientService {
    //Карта клиентов id - список персонажей
    private Map<Integer, List<Character>> clientMap = new HashMap<>();
    private List<String> login = new ArrayList<>();
    private List<String> password = new ArrayList<>();

    public void addCharacter(int id, Character newCharacter){
        clientMap.get(id).add(newCharacter);
    }

    public Map<Integer, List<Character>> findAll(){
        return clientMap;
    }
}
