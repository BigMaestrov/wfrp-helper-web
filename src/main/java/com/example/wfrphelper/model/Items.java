package com.example.wfrphelper.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
@Component
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long items_id;
    @Autowired
    private List<Item> itemList;
    private int totalWeight;

    public Items(List<Item> itemList, int totalWeight) {
        this.itemList = itemList;
        this.totalWeight = totalWeight;
    }

    public Items() {
        itemList = new ArrayList<Item>();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }
}
