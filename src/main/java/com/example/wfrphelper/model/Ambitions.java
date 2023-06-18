package com.example.wfrphelper.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "ambition")
@Component
public class Ambitions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ambition_id;
    String shortAmbitions;
    String longAmbitions;

    public String getShortAmbitions() {
        return shortAmbitions;
    }

    public void setShortAmbitions(String shortAmbitions) {
        this.shortAmbitions = shortAmbitions;
    }

    public String getLongAmbitions() {
        return longAmbitions;
    }

    public void setLongAmbitions(String longAmbitions) {
        this.longAmbitions = longAmbitions;
    }
}
