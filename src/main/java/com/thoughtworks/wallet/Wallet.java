package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;

public class Wallet {
    private Rupee amount;

    public Wallet() throws NegativeAmountException {
        this.amount = new Rupee(0);
    }

    public void add(Rupee amount) {
        this.amount = amount;
    }

    public Rupee balance() {
        return amount;
    }
}
