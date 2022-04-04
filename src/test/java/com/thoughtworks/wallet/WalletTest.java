package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {
    @Test
    void shouldAddMoneyToWalletWhenAmountIsGiven() throws NegativeAmountException {
        int amount = 20;
        Wallet wallet = new Wallet();

        wallet.add(amount);
        int balance = wallet.balance();

        assertEquals(20, balance);
    }

    @Test
    void shouldNotAddMoneyWhenNegativeAmountIsGiven() {
        int amount = -1;
        Wallet wallet = new Wallet();

        assertThrows(NegativeAmountException.class, () -> wallet.add(amount));
    }
}
