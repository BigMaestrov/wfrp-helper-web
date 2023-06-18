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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resilience_id")
    private Resilience resilience;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ambition_id")
    private Ambitions ambitions;
}
