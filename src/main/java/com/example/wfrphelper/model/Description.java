package com.example.wfrphelper.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Description {
    private String description;
    @Autowired
    private Resilience resilience;
    @Autowired
    private Ambitions ambitions;
}
