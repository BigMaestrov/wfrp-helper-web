package com.example.wfrphelper.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Items {
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
