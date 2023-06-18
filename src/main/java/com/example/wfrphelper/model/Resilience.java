package com.example.wfrphelper.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "resilience")
@Component
public class Resilience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resilience_id;
    String resilience;
    String resolve;
    String motivation;
    @OneToOne(mappedBy = "resilience")
    Description description;

    public Resilience() {
    }

    public Resilience(String resilience, String resolve, String motivation) {
        this.resilience = resilience;
        this.resolve = resolve;
        this.motivation = motivation;
    }

    public String getResilience() {
        return resilience;
    }

    public void setResilience(String resilience) {
        this.resilience = resilience;
    }

    public String getResolve() {
        return resolve;
    }

    public void setResolve(String resolve) {
        this.resolve = resolve;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }
}
