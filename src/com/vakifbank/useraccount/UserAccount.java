package com.vakifbank.useraccount;

// User account details
public class UserAccount {
    private String name;
    private String surname;
    private String TC;
    private String email;
    private String password;
    private String accountNumber;


    //Constructor to initiate
    public UserAccount(String name, String surname, String TC, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.TC = TC;
        this.email = email;
        this.password = password;
        this.accountNumber = generateAccountNumber();
    }

    // Static counter for account numbers (starting from 100000)
    private static int nextAccountNumber = 100000;

    // Synchronized to ensure thread safety if multiple accounts are created concurrently.
    private synchronized String generateAccountNumber() {
        String account = "ACCT" + nextAccountNumber;
        nextAccountNumber++;
        return account;
    }


    // getters
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTC() {
        return TC;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}