package com.example.wfrphelper.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Inventory {
    @Autowired
    private Items items;
    @Autowired
    private Wallet wallet;

    public Inventory(Items items, Wallet wallet) {
        this.items = items;
        this.wallet = wallet;
    }

    public Inventory() {
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
