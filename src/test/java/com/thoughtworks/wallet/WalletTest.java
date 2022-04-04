package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void shouldAddMoneyToWalletWhenAmountIsGiven() throws NegativeAmountException {
        Wallet wallet = new Wallet();
        Money rupee = new Money(20, Currency.RUPEE);
        Money expectedRupee = new Money(40, Currency.DOLLAR);

        wallet.add(rupee);
        wallet.add(rupee);
        Money balance = wallet.balance();

        assertEquals(expectedRupee, balance);
    }
}
