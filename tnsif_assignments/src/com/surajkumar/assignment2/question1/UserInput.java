package com.surajkumar.assignment2.question1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Prompt user for their last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Combine first name and last name
        String fullName = firstName + " " + lastName;

        // Prompt user for their roll number
        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();

        // Prompt user for their grade
        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);

        // Prompt user for their percentage
        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        // Display user details
        System.out.println("\n--- User Details ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
