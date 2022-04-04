package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;

public class Rupee {
    private final int value;

    public Rupee(int amount) throws NegativeAmountException {
        if (amount < 0) throw new NegativeAmountException();
        this.value = amount;
    }

    public int value() {
        return value;
    }
}
