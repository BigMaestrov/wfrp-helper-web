package com.example.wfrphelper.model;

import org.springframework.stereotype.Component;

@Component
public class Ambitions {
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
