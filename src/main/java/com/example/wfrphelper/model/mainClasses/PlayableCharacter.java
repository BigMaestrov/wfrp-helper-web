package com.example.wfrphelper.model.mainClasses;

import com.example.wfrphelper.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "playable_character")
@Component
public class PlayableCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playable_character_id;
    String name;
    @OneToOne(mappedBy = "startCharacteristics_id")
    private Characteristics startCharacteristics;
    @OneToOne(mappedBy = "characteristics_id")
    private Characteristics characteristics;
    @OneToOne(mappedBy = "inventory_id")
    private Inventory inventory;
    @OneToOne(mappedBy = "description_id")
    private Description description;
    @OneToOne(mappedBy = "experience_id")
    private Experience experience;
    @OneToOne(mappedBy = "basicSkills_id")
    private BasicSkills basicSkills;
    @OneToOne(mappedBy = "startBasicSkills_id")
    private BasicSkills startBasicSkills;
    @OneToOne(mappedBy = "fate_id")
    private Fate fate;

    public PlayableCharacter(String name, Characteristics startCharacteristics, Characteristics characteristics, Inventory inventory, Description description, Experience experience, BasicSkills basicSkills, BasicSkills startBasicSkills, Fate fate) {
        this.name = name;
        this.startCharacteristics = startCharacteristics;
        this.characteristics = characteristics;
        this.inventory = inventory;
        this.description = description;
        this.experience = experience;
        this.basicSkills = basicSkills;
        this.startBasicSkills = startBasicSkills;
        this.fate = fate;
    }

    public PlayableCharacter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Characteristics getStartCharacteristics() {
        return startCharacteristics;
    }

    public void setStartCharacteristics(Characteristics startCharacteristics) {
        this.startCharacteristics = startCharacteristics;
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public BasicSkills getBasicSkills() {
        return basicSkills;
    }

    public void setBasicSkills(BasicSkills basicSkills) {
        this.basicSkills = basicSkills;
    }

    public BasicSkills getStartBasicSkills() {
        return startBasicSkills;
    }

    public void setStartBasicSkills(BasicSkills startBasicSkills) {
        this.startBasicSkills = startBasicSkills;
    }

    public Fate getFate() {
        return fate;
    }

    public void setFate(Fate fate) {
        this.fate = fate;
    }
}
