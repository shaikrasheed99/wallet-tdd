package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void shouldAddMoneyToWalletWhenAmountIsGiven() throws NegativeAmountException {
        Wallet wallet = new Wallet();
        Money rupee = new Money(20, Currency.RUPEE);
        Money expectedRupee = new Money(40, Currency.RUPEE);

        wallet.add(rupee);
        wallet.add(rupee);
        Money balance = wallet.balance();

        assertEquals(expectedRupee, balance);
    }

    @Test
    void shouldAbleToAddMoneyWhenDollarAndRupeeIsGiven() throws NegativeAmountException {
        Wallet wallet = new Wallet();
        Money rupee = new Money(1, Currency.RUPEE);
        Money dollar = new Money(1, Currency.DOLLAR);

        wallet.add(rupee);
        wallet.add(dollar);
        Money balance = wallet.balance();

        assertEquals(new Money(76, Currency.RUPEE), balance);
    }
}
