package com.surajkumar.assignment4;

//BankAccount class representing a simple bank account
public class BankAccount {
 private int accountNumber;
 private double balance;

 // Parameterized constructor to initialize account number and balance
 public BankAccount(int accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Method to deposit amount into the account
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be greater than zero.");
     }
     balance += amount;
     System.out.println("Successfully deposited: ₹" + amount);
 }

 // Method to withdraw amount from the account
 public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient balance for withdrawal.");
     }
     balance -= amount;
     System.out.println("Successfully withdrawn: ₹" + amount);
 }

 // Method to display the current balance
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber + " | Current Balance: ₹" + balance);
 }
}
