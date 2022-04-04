package com.thoughtworks.wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RupeeTest {
    @Test
    void shouldCreateRupeeWhenAmountIsGiven() {
        int amount = 10;
        Rupee rupee = new Rupee(amount);

        int value = rupee.value();

        assertEquals(10, value);
    }
}
