package com.example.wfrphelper;

import com.example.wfrphelper.model.Item;
import com.example.wfrphelper.model.Items;
import com.example.wfrphelper.model.Wallet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        /*ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Wallet wallet = new Wallet(1, 2, 3, "nikita");
        try {
            String s = objectMapper.writeValueAsString(wallet);
            System.out.println(s);
            Wallet wallet1 = objectMapper.readValue(s, Wallet.class);
            wallet1.showWallet();
            System.out.println(wallet.getOwner());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

*/
        SpringApplication.run(Main.class, args);
    }
}

