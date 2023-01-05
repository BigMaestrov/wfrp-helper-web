package com.example.wfrphelper.Services;

import com.example.wfrphelper.model.Wallet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WalletService {
    private List<Wallet> walletList = new ArrayList<Wallet>();

    public void addWallet(Wallet newWallet){
        walletList.add(newWallet);
    }

    public List<Wallet> findAll(){
        return walletList;
    }
}
