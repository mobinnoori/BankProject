package com.vakifbank.bankaccount;

import com.vakifbank.useraccount.UserAccount;
import com.vakifbank.useraccount.UserManager;

import java.util.ArrayList;
import java.util.Scanner;

public class SavingsAccount {
    private static double balance;

    static Scanner scanner = new Scanner(System.in);


    // saving money for one year
    public static void saveMoneyForOneYear() {
        System.out.println("Invest the money you want to save: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            double save = amount / 100 * 12.50;
            balance = save + amount;
            System.out.println("The percentage of the interest in one year is 12.5%.");
            System.out.println("Your new balance: " + balance);
        }
    }


    // saving money for one year
    public static void saveMoneyForTwoYears() {
        System.out.println("Invest the money you want to save: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            double save = amount / 100 * 25;
            balance = save + amount;
            System.out.println("The percentage of the interest in two years is 25%.");
            System.out.println("Your new balance: " + balance);
        }
    }


    // display account details
    public static void showAccountInfo() {
        ArrayList<UserAccount> allUsers = UserManager.getUsers();
        for (UserAccount user : allUsers) {
            System.out.println("Account Number: " + user.getAccountNumber());
            System.out.println("Account Holder: " + user.getName() + " " + user.getSurname());
            System.out.println("Current Balance: " + balance);
        }
    }
}