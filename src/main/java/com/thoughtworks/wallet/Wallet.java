package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;

public class Wallet {
    private Money amount;

    public Wallet() throws NegativeAmountException {
        this.amount = new Money(0, Currency.RUPEE);
    }

    public void add(Money amount) throws NegativeAmountException {
        this.amount = this.amount.add(amount);
    }

    public Money balance() {
        return amount;
    }
}
