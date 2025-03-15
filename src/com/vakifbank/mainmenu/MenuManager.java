package com.vakifbank.mainmenu;

import com.vakifbank.bankaccount.CheckingAccount;
import com.vakifbank.bankaccount.CreditAccount;
import com.vakifbank.bankaccount.SavingsAccount;
import com.vakifbank.useraccount.UserManager;

import java.util.Scanner;

public class MenuManager {
    static Scanner scanner = new Scanner(System.in);

    // signing up and logging menu
    public static void signunLoginMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nWelcome to VakifBank");
            System.out.println("Click number 1 to sign up.");
            System.out.println("Click number 2 to login.");
            System.out.println("Click number 3 to exit.");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    UserManager.signup();
                    break;

                case 2:
                    boolean flag = UserManager.Login();
                    if (flag) {
                        bankAccountTypes();
                    }
                    break;

                case 3:
                    exit = true;
                    System.out.println("Exiting....Bye");
                    break;

                default:
                    System.out.println("Invalid number! Please enter a valid number.");
            }
        }
        scanner.close();
    }


    // choosing the types of bank accounts
    public static void bankAccountTypes() {
        boolean exit = false;
        while (!exit) {

            System.out.println("\nWelcome to VakifBank..");
            System.out.println("Click number 1 to open your checking account.");
            System.out.println("Click number 2 to open your saving account.");
            System.out.println("Click number 3 to open your credit account.");
            System.out.println("Click number 4 to exit.");
            int select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1:
                    chekingAccount();
                    break;

                case 2:
                    savingAccount();
                    break;

                case 3:
                    creditAccount();
                    break;

                case 4:
                    exit = true;
                    break;
            }
        }
    }


    public static void chekingAccount() {
        boolean exit = false;
        while (!exit) {

            System.out.println("\nWelcome");
            System.out.println("Click number 1 to check your account.");
            System.out.println("Click number 2 to deposit amount.");
            System.out.println("Click number 3 to withdraw amount.");
            System.out.println("Click number 4 to exit.");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    CheckingAccount.displayAccountInfo();
                    break;

                case 2:
                    CheckingAccount.deposit();
                    break;

                case 3:
                    CheckingAccount.withdraw();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting....Bye");
                    break;

                default:
                    System.out.println("Invalid number! Please enter a valid number.");
            }
        }
    }


    public static void savingAccount() {
        boolean exit = false;
        while (!exit) {

            System.out.println("\nWelcome");
            System.out.println("Click on number 1 to check your account.");
            System.out.println("Click on number 2 to deposit the amount you want to save for one(1) year. (interest rate: 12.5%)");
            System.out.println("Click on number 3 to deposit the amount you want to save for two(2) years. (interest rate: 25%)");
            System.out.println("Click number 4 to close.");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    SavingsAccount.showAccountInfo();
                    break;

                case 2:
                    SavingsAccount.saveMoneyForOneYear();
                    break;

                case 3:
                    SavingsAccount.saveMoneyForTwoYears();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting....Bye");
                    break;

                default:
                    System.out.println("Invalid number! Please enter a valid number.");
            }
        }
    }


    public static void creditAccount() {
        boolean exit = false;
        while (!exit) {

            System.out.println("\nWelcome");
            System.out.println("Click on number 1 to check your account.");
            System.out.println("Click on number 2 to loan calculation.");
            System.out.println("Click number 3 to close.");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    CreditAccount.displayAccountInfo();
                    break;

                case 2:
                    CreditAccount.LoanCalculation();
                    break;

                case 3:
                    exit = true;
                    System.out.println("Exiting....Bye");
                    break;

                default:
                    System.out.println("Invalid number! Please enter a valid number.");
            }
        }
    }
}