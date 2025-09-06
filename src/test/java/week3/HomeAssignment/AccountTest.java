package week3.HomeAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account acc = new Account();

    @Test
    void testDeposit() {
        acc.deposit(100.0);
        assertEquals(100.0, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        acc.deposit(50.0);
        assertEquals(20.0, acc.withdraw(20));
    }

    @Test
    void testCheckBalance() {
        assertEquals(0, acc.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        acc.deposit(-50.0);
        assertEquals(0.0, acc.getBalance());
    }

    @Test
    void testWithdrawNegativeAmount() {
        acc.deposit(100.0);
        assertEquals(0, acc.withdraw(-30.0));
        assertEquals(100.0, acc.getBalance());
    }

    @Test
    void testWithdrawOverBalance() {
        acc.deposit(100.0);
        assertEquals(0.0, acc.withdraw(150.0));
        assertEquals(100.0, acc.getBalance());
    }
}

// Opiskelija: Quang (Than Ngoc)