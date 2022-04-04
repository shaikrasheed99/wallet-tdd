package com.thoughtworks.wallet;

public enum Currency {
    RUPEE(1),
    DOLLAR(75);
    private final int convertionFactor;

    Currency(int convertionFactor) {
        this.convertionFactor = convertionFactor;
    }

    public int covertToBase(int value) {
        return value * convertionFactor;
    }
}
