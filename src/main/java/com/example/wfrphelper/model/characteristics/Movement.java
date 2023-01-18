package com.example.wfrphelper.model.characteristics;

import org.springframework.stereotype.Component;

@Component
public abstract class Movement {
    int movement;
    int walk;
    int run;

    public Movement(int movement, int walk, int run) {
        this.movement = movement;
        this.walk = walk;
        this.run = run;
    }

    public Movement() {
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getWalk() {
        return walk;
    }

    public void setWalk(int walk) {
        this.walk = walk;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
}

