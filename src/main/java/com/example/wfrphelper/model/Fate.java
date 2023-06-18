package com.example.wfrphelper.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "fate")
@Component
public class Fate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fate_id;
    int fate;
    int fortunate;
}
