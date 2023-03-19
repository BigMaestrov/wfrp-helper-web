package com.example.wfrphelper.controller;

import com.example.wfrphelper.services.WalletService;
import org.springframework.stereotype.Controller;

@Controller
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }
/*
    @GetMapping("/wallets")
    public String home(Model model) {
        var wallets = walletService.findAll();
        model.addAttribute("wallets", wallets);
        return "wallets.html";
    }

    @PostMapping("/wallets")
    public String addProduct(
            @RequestParam String owner,
            @RequestParam int crown,
            @RequestParam int shillings,
            @RequestParam int pennies,
            Model model) {
        Wallet w = new Wallet();
        w.setGoldCrown(crown);
        w.setSilverShillings(shillings);
        w.setBrassPennies(pennies);
        walletService.addWallet(w);
        var wallets = walletService.findAll();
        model.addAttribute("wallets", wallets);
        return "wallets.html";
    }*/
}

