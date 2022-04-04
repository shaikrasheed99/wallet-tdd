package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RupeeTest {
    @Test
    void shouldCreateRupeeWhenAmountIsGiven() throws NegativeAmountException {
        int amount = 10;
        Rupee rupee = new Rupee(amount);

        int value = rupee.value();

        assertEquals(10, value);
    }

    @Test
    void shouldNotCreateRupeeWhenNegativeAmountIsGiven() {
        int amount = -1;

        assertThrows(NegativeAmountException.class, () -> new Rupee(amount));
    }
}
