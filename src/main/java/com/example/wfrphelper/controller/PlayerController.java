package com.example.wfrphelper.controller;

import com.example.wfrphelper.model.mainClasses.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.wfrphelper.services.PlayerService;

import java.util.List;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping(value = "/players")
    public ResponseEntity<?> create(@RequestBody Player player) {
        playerService.create(player);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //Получение всех игроков
    @GetMapping(value = "/players")
    public ResponseEntity<List<Player>> read() {
        final List<Player> clients = playerService.readAll();

        return clients != null && !clients.isEmpty()
                ? new ResponseEntity<>(clients, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    //Получение игрока
    @GetMapping(value = "/players/{id}")
    public ResponseEntity<Player> read(@PathVariable(name = "id") int id) {
        final Player client = playerService.read(id);

        return client != null
                ? new ResponseEntity<>(client, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/players/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Player player) {
        final boolean updated = playerService.update(player, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/clients/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = playerService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}

