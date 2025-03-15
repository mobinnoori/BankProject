package com.vakifbank.bankaccount;

import com.vakifbank.useraccount.UserAccount;
import com.vakifbank.useraccount.UserManager;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditAccount {
    private static double monthlyInstallment;
    private static double totalRepayment;
    private static double totalInterest;
    private static double monthlyInterestRate;

    public static void LoanCalculation() {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the loan details.");
        System.out.print("Loan Amount ($): ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Annual Interest Rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Loan Term (Months): ");
        int term = scanner.nextInt();

        // Calculate the monthly interest rate
        monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate the monthly installment (Annuity formula)
        monthlyInstallment = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, term)) /
                (Math.pow(1 + monthlyInterestRate, term) - 1);

        // Calculate the total repayment and total interest
        totalRepayment = monthlyInstallment * term;
        totalInterest = totalRepayment - loanAmount;

        // Print the results
        result();
    }


    // display account details
    public static void displayAccountInfo() {
        ArrayList<UserAccount> allUsers = UserManager.getUsers();
        for (UserAccount user : allUsers) {
            System.out.println("Account Number: " + user.getAccountNumber());
            System.out.println("Account Holder: " + user.getName() + " " + user.getSurname());
            result();
        }
    }

    // printing the result
    public static void result() {
        System.out.printf("\nMonthly Installment: %.2f $\n", monthlyInstallment);
        System.out.printf("Total Repayment: %.2f $\n", totalRepayment);
        System.out.printf("Total Interest: %.2f $\n", totalInterest);
    }
}