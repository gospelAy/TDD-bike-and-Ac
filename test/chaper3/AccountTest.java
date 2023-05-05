package chaper3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {




    @Test
    public void testThatObjectAccountExist(){
        Account account = new Account(2000.0);
        assertNotNull(account);
    }
    @Test
    public void testThatWithdrawCanBeMade(){
        Account account = new Account(2000.0);
        account.withdraw(1000.0);
        assertEquals(1000.0, account.getBalance());

    }
}