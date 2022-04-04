package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;

import java.util.Objects;

public class Rupee {
    private final int value;

    public Rupee(int amount) throws NegativeAmountException {
        if (amount < 0) throw new NegativeAmountException();
        this.value = amount;
    }

    public int value() {
        return value;
    }

    public Rupee add(Rupee amount) throws NegativeAmountException {
        return new Rupee(value + amount.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rupee rupee = (Rupee) o;
        return value == rupee.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
