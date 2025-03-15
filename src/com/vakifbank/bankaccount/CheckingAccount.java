package com.vakifbank.bankaccount;

import com.vakifbank.useraccount.UserAccount;
import com.vakifbank.useraccount.UserManager;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckingAccount {
    private static double balance;

    static Scanner scanner = new Scanner(System.in);


    // Method to deposit money
    public static void deposit() {
        System.out.println("Please enter the amount that you wanna deposit.");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("New balance:" + balance);
        }
    }


    // Method to withdraw money
    public static void withdraw() {
        System.out.println("Please enter the amount that you wanna withdraw.");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("New balance:" + balance);
        } else {
            System.out.println("You don't have enough amount!");
        }
    }


    // Display account details
    public static void displayAccountInfo() {
        ArrayList<UserAccount> allUsers = UserManager.getUsers();
        for (UserAccount user : allUsers) {
            System.out.println("Account Number: " + user.getAccountNumber());
            System.out.println("Account Holder: " + user.getName() + " " + user.getSurname());
            System.out.println("Current Balance: " + balance);
        }
    }
}