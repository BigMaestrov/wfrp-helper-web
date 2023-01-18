package com.example.wfrphelper.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Inventory {
    @Autowired
    private Items items;
    @Autowired
    private Wallet wallet;
}
