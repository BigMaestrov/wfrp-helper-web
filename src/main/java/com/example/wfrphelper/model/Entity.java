package com.example.wfrphelper.model;

public abstract class Entity {
    String entityClass;
    Characteristics characteristics;
    String Appearance;
    Movement movement;

    public String getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(String entityClass) {
        this.entityClass = entityClass;
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public String getAppearance() {
        return Appearance;
    }

    public void setAppearance(String appearance) {
        Appearance = appearance;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }
}
