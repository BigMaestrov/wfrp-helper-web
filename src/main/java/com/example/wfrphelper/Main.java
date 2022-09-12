package com.example.wfrphelper;

import com.example.wfrphelper.config.Config;
import com.example.wfrphelper.model.PlayableCharacter;
import com.example.wfrphelper.model.Wallet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        //SpringApplication.run(Main.class, args);
        /*
        var context = new AnnotationConfigApplicationContext(Config.class);
        Wallet wallet = context.getBean(Wallet.class);
        wallet.showWallet();
        context.getBean(Wallet.class).setBrassPennies(20);
        context.getBean(Wallet.class).showWallet();*/
        var context = new AnnotationConfigApplicationContext(Config.class);
        PlayableCharacter playableCharacter = context.getBean(PlayableCharacter.class);
        playableCharacter.getWallet().showWallet();
    }
}
