package com.thoughtworks.wallet;

public class Currency {
    public static final Currency RUPEE = new Currency(1);
    public static final Currency DOLLAR = new Currency(75);
    private final int convertionFactor;

    public Currency(int convertionFactor) {
        this.convertionFactor = convertionFactor;
    }

    public int covertToBase(int value) {
        return value * convertionFactor;
    }
}
