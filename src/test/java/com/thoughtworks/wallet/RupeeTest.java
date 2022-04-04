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

        assertEquals(new Rupee(10), rupee);
    }

    @Test
    void shouldNotCreateRupeeWhenNegativeAmountIsGiven() {
        int amount = -1;

        assertThrows(NegativeAmountException.class, () -> new Rupee(amount));
    }

    @Test
    void shouldAbleToAddOneRupeeWhenAnotherRupeeIsGiven() throws NegativeAmountException {
        Rupee rupeeOne = new Rupee(10);
        Rupee rupeeTwo = new Rupee(10);
        Rupee expectedRupee = new Rupee(20);

        Rupee actualRupee = rupeeOne.add(rupeeTwo);

        assertEquals(expectedRupee, actualRupee);
    }

    @Test
    void shouldEquateTwoRupeeObjectsWhenSameValueIsGiven() throws NegativeAmountException {
        Rupee rupeeOne = new Rupee(10);
        Rupee rupeeTwo = new Rupee(10);

        assertEquals(rupeeOne, rupeeTwo);
    }
}
