package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;

public class Wallet {
    private int amount;

    public Wallet() {
        this.amount = 0;
    }

    public void add(int amount) throws NegativeAmountException {
        if (amount < 0) throw new NegativeAmountException();
        this.amount = amount;
    }

    public int balance() {
        return amount;
    }
}
