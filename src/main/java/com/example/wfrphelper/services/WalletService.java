package com.example.wfrphelper.services;

import com.example.wfrphelper.model.Wallet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class WalletService {
    // Хранилище кошельков
    private static final Map<Integer, Wallet> WALLET_REPOSITORY_MAP = new HashMap<>();

    // Переменная для генерации ID кошелька
    private static final AtomicInteger WALLET_ID_HOLDER = new AtomicInteger();

    public void create(Wallet wallet) {
        final int walletId = WALLET_ID_HOLDER.incrementAndGet();
        wallet.setOwnerId(walletId);
        WALLET_REPOSITORY_MAP.put(walletId, wallet);
    }

    public List<Wallet> readAll() {
        return new ArrayList<>(WALLET_REPOSITORY_MAP.values());
    }

    public Wallet read(int id) {
        return WALLET_REPOSITORY_MAP.get(id);
    }

    public boolean update(Wallet wallet, int id) {
        if (WALLET_REPOSITORY_MAP.containsKey(id)) {
            wallet.setOwnerId(id);
            WALLET_REPOSITORY_MAP.put(id, wallet);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        return WALLET_REPOSITORY_MAP.remove(id) != null;
    }
}
