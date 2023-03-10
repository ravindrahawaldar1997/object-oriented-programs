package com.birdgelabz.object_oriented_programs;

import java.util.Scanner;

public class AccountTest {
   public long withdrawMoney() {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        long accountBalance = 100000;
        System.out.println("Enter the amount which you want to debit");
        long debitAmount = sc.nextLong();
        if (accountBalance > debitAmount) {
            accountBalance = account.debit(accountBalance, debitAmount);
        } else {
            System.out.println("Debit amount exceeds the account balance");
        }
        System.out.println("Account balance is " + accountBalance);
        return accountBalance;
    }

    public static void main(String[] args) {
        AccountTest accountTest = new AccountTest();
        accountTest.withdrawMoney();
    }
}
