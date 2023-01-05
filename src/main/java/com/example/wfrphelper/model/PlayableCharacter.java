package com.example.wfrphelper.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayableCharacter extends Character {

    String career;
    @Autowired
    Resilience resilience;
    @Autowired
    Fate fate;
    @Autowired
    Experience experience;
    @Autowired
    Ambitions ambitions;

    public PlayableCharacter(String career, Resilience resilience, Fate fate, Experience experience, Ambitions ambitions) {
        this.career = career;
        this.resilience = resilience;
        this.fate = fate;
        this.experience = experience;
        this.ambitions = ambitions;
    }

    public PlayableCharacter() {
    }
}
