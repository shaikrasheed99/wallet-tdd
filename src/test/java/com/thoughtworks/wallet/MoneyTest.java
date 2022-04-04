package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoneyTest {
    @Test
    void shouldCreateRupeeWhenAmountIsGiven() throws NegativeAmountException {
        Money rupee = new Money(10, Currency.RUPEE);

        assertEquals(new Money(10, Currency.RUPEE), rupee);
    }

    @Test
    void shouldNotCreateRupeeWhenNegativeAmountIsGiven() {
        int amount = -1;

        assertThrows(NegativeAmountException.class, () -> new Money(amount, Currency.RUPEE));
    }

    @Test
    void shouldAbleToAddOneRupeeWhenAnotherRupeeIsGiven() throws NegativeAmountException {
        Money rupeeOne = new Money(10, Currency.RUPEE);
        Money rupeeTwo = new Money(10, Currency.RUPEE);
        Money expectedRupee = new Money(20, Currency.RUPEE);

        Money actualRupee = rupeeOne.add(rupeeTwo);

        assertEquals(expectedRupee, actualRupee);
    }

    @Test
    void shouldEquateTwoRupeeObjectsWhenSameValueIsGiven() throws NegativeAmountException {
        Money rupeeOne = new Money(10, Currency.RUPEE);
        Money rupeeTwo = new Money(10, Currency.RUPEE);

        assertEquals(rupeeOne, rupeeTwo);
    }

    @Test
    void shouldCompareOneDollarWithSeventyFiveRupees() throws NegativeAmountException {
        Money seventyFiveRupees = new Money(75, Currency.RUPEE);
        Money oneDollar = new Money(1, Currency.DOLLAR);

        assertEquals(seventyFiveRupees, oneDollar);
        assertEquals(oneDollar, seventyFiveRupees);
    }
}
