package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void shouldAddMoneyToWalletWhenAmountIsGiven() throws NegativeAmountException {
        int amount = 20;
        Wallet wallet = new Wallet();
        Rupee rupee = new Rupee(amount);
        Rupee expectedAmount = new Rupee(20);

        wallet.add(rupee);
        Rupee balance = wallet.balance();

        assertEquals(expectedAmount.value(), balance.value());
    }
}
