package com.example.wfrphelper.model;

import org.springframework.stereotype.Component;

/**
 * Class for storing and exchanging money
 * goldCrown = 20 silverShillings = 240 brassPennies
 * silverShillings = 12brassPennies
 *
 * @version 1.0
 * @autor Nikita Egorov
 */
@Component
public class Characteristics {
    int movement;
    int weaponSkill;
    int ballisticSkill;
    int strength;
    int toughness;
    int initiative;
    int dexterity;
    int leadership;
    int intelligence;
    int willPower;
    int fellowship;

    public Characteristics(int movement, int weaponSkill, int ballisticSkill, int strength, int toughness, int initiative, int dexterity, int leadership, int intelligence, int willPower, int fellowship) {
        this.movement = movement;
        this.weaponSkill = weaponSkill;
        this.ballisticSkill = ballisticSkill;
        this.strength = strength;
        this.toughness = toughness;
        this.initiative = initiative;
        this.dexterity = dexterity;
        this.leadership = leadership;
        this.intelligence = intelligence;
        this.willPower = willPower;
        this.fellowship = fellowship;
    }

    public Characteristics() {
    }
}
