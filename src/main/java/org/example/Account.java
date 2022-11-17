package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

    private int balance;
    private String name;

    public Account() {
    }

    public void setBalance(int inputBalance) {
        if ( inputBalance < 0 ) {
            this.balance = 0;
        } else {
            this.balance = inputBalance;
        }
    }

    public void depositBalance(int depo, Account account) {
        if ( depo > 0 ) {
            account.setBalance( account.getBalance() + depo);
        } else {
            System.out.println("Negative depo");
        }
    }

    public void withdrawalBalance(int amount, Account account) {
        if ( account.getBalance() >= amount) {
            account.setBalance( account.getBalance() - amount);
        } else {
            System.out.println("Amount is higher than balance");
        }
    }



}
