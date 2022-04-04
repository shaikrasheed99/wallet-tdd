package com.thoughtworks.wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void shouldAddMoneyToWalletWhenAmountIsGiven() {
        int amount = 20;
        Wallet wallet = new Wallet();

        wallet.add(amount);
        int balance = wallet.balance();

        assertEquals(20, balance);
    }
}
