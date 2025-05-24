package com.surajkumar.assignment4;

import java.util.HashMap;
import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        System.out.println("=== Welcome to the Dynamic Banking System ===");

        while (true) {
            System.out.println("\n1. Create New Account");
            System.out.println("2. Access Existing Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    // Creating a new account
                    System.out.print("Enter new account number: ");
                    int newAccountNumber = scanner.nextInt();

                    if (accounts.containsKey(newAccountNumber)) {
                        System.out.println("Account already exists!");
                    } else {
                        System.out.print("Enter initial deposit amount: ₹");
                        double initialDeposit = scanner.nextDouble();
                        BankAccount newAccount = new BankAccount(newAccountNumber, initialDeposit);
                        accounts.put(newAccountNumber, newAccount);
                        System.out.println("Account created successfully!");
                    }
                    break;

                case 2:
                    // Accessing an existing account
                    System.out.print("Enter your account number: ");
                    int accountNumber = scanner.nextInt();

                    if (accounts.containsKey(accountNumber)) {
                        BankAccount currentAccount = accounts.get(accountNumber);
                        accountMenu(currentAccount, scanner);
                    } else {
                        System.out.println("Account not found. Please create a new account first.");
                    }
                    break;

                case 3:
                    // Exit
                    System.out.println("Thank you for using the Banking System!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    // Menu to operate on selected account
    private static void accountMenu(BankAccount account, Scanner scanner) {
        while (true) {
            System.out.println("\n--- Account Operations ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ₹");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ₹");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                        break;
                    case 3:
                        account.displayBalance();
                        break;
                    case 4:
                        return; // Go back to main menu
                    default:
                        System.out.println("Invalid choice. Please select between 1 and 4.");
                }
            } catch (InvalidAmountException | InsufficientFundsException e) {
                System.out.println("Transaction Error: " + e.getMessage());
            }
        }
    }
}
