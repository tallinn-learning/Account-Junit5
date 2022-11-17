package org.example;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AccountTest {

    Account account;

    @BeforeAll
    public static void init(){
        System.out.println("BeforeAll init() method called");
    }

    @BeforeEach
    public void initEach(){
        //test setup code
        System.out.println("BeforeEach initEach() method called");
        account = new Account();
    }

    @AfterEach
    public void afterEach(){
        //Test cleanup code
        System.out.println("AfterEach afterEach() method called");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }

    @Test
    public void testPositiveDeposit() {
        account.setBalance(1);
        account.depositBalance(3, account);
        Assertions.assertEquals( 4, account.getBalance() );
    }

    @Test
    public void testNegativeDeposit() {
        int initialBalance = 1;
        account.setBalance(initialBalance);
        account.depositBalance(-3, account);
        Assertions.assertEquals( initialBalance, account.getBalance() );
    }

    @Test
    public void testNegativeWithdrawal()  {
        account.setBalance(4);
        account.withdrawalBalance(3, account);
        Assertions.assertEquals(1, account.getBalance());
    }

    @Test
    public void testNameNull()
    {
        Assertions.assertNull(account.getName());
    }

    @Test
    public void testNameNotNull()
    {
        System.out.println("not null test");
        account.setName("Nick");
        Assertions.assertNotNull( account.getName() );
    }
}
