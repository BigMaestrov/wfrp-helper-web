package com.example.wfrphelper.model;

import org.springframework.stereotype.Component;

@Component
public class PlayableCharacter extends Character {
    String career;
    Resilience resilience;
    Fate fate;
    Experience experience;
    Ambitions ambitions;
}
