package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void shouldAddMoneyToWalletWhenAmountIsGiven() throws NegativeAmountException {
        Wallet wallet = new Wallet();
        Rupee rupee = new Rupee(20);
        Rupee expectedRupee = new Rupee(40);

        wallet.add(rupee);
        wallet.add(rupee);
        Rupee balance = wallet.balance();

        assertEquals(expectedRupee, balance);
    }
}
