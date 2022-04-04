package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;

import java.util.Objects;

public class Money {
    private final int value;
    private final Currency currency;

    public Money(int value, Currency currency) throws NegativeAmountException {
        if (value < 0) throw new NegativeAmountException();
        this.value = value;
        this.currency = currency;
    }

    public Money add(Money other) throws NegativeAmountException {
        int baseRupee = other.currency.covertToBase(other.value);
        return new Money(value + baseRupee, currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        int d1 = this.currency.covertToBase(this.value);
        int d2 = money.currency.covertToBase(money.value);
        return d1 == d2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
