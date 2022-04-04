package com.thoughtworks.wallet;

public class Rupee {
    private final int value;

    public Rupee(int amount) {
        this.value = amount;
    }

    public int value() {
        return value;
    }
}
