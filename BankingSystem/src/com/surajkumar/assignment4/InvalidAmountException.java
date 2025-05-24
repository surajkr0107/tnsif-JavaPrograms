package com.surajkumar.assignment4;

//Custom exception for invalid deposit/withdrawal amount
public class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

