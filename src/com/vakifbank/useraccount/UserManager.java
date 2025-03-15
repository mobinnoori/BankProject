package com.vakifbank.useraccount;

import java.util.ArrayList;
import java.util.Scanner;

// the class to sign up users
public class UserManager {
    // Shared user list
    private static ArrayList<UserAccount> users = new ArrayList<>();

    public static ArrayList<UserAccount> getUsers() {
        return users;
    }

    public static void signup() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Click Login, if you have already registered.");
        System.out.println("Click Sign Up, if you want to register.");

        // User details
        System.out.println("\nPlease enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Please enter your TC: ");
        String TC = scanner.nextLine();

        System.out.println("Please enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        // Create and add user account
        users.add((new UserAccount(name, surname, TC, email, password)));
        System.out.println("\nYou have registered successfully. Dear, " + name + " " + surname);

        // Create an account (CheckingAccount package) for the user automatically
        ArrayList<UserAccount> allUsers = UserManager.getUsers();
        for (UserAccount user : allUsers) {
            System.out.println("Your new account number is: " + user.getAccountNumber());
        }
    }


    // the class to login users
    public static boolean Login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login page");
        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = false;
        // Check if the user exists in the list
        for (UserAccount user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("\nLogin successful! Welcome, " + user.getName() + " " + user.getSurname());
                isAuthenticated = true;
                break;
            }
        }

        if (!isAuthenticated) {
            System.out.println("\nLogin failed! Email or password is incorrect.");
        }
        return isAuthenticated;
    }
}