package com.example.wfrphelper.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "description")
@Component
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long description_id;
    private String description;
    @OneToOne(mappedBy = "resilience_id")
    private Resilience resilience;
    @OneToOne(mappedBy = "resilience_id")
    private Ambitions ambitions;
}
