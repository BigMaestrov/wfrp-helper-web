package com.example.wfrphelper.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Component
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item_id;
    private String name;
    private String date;
    private int weight;
    private int value;

    public Item(String name, String date, int weight, int value) {
        this.name = name;
        this.date = date;
        this.weight = weight;
        this.value = value;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        return name+ " "+date+" "+weight+ " "+value;
    }

}
