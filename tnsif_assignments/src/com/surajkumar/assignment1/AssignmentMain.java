package com.surajkumar.assignment1;

import com.surajkumar.assignment1.employees.Manager;
import com.surajkumar.assignment1.employees.Developer;
import com.surajkumar.assignment1.utilities.EmployeeUtilities;

/**
 * The main class to demonstrate the functionality of Employee, Manager, Developer, 
 * and EmployeeUtilities classes.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("Suraj", 107, 750000, 10);
        Developer developer = new Developer("Ketan", 101, 600000, "Java");

        // Create an EmployeeUtilities instance
        EmployeeUtilities utilities = new EmployeeUtilities();

        // Perform operations using EmployeeUtilities
        System.out.println("=== Manager Details ===");
        utilities.displayManagerDetails(manager);
        utilities.increaseSalary(manager, 50000); // Increase salary for manager

        System.out.println("\n=== Developer Details ===");
        utilities.displayDeveloperDetails(developer);
        utilities.increaseSalary(developer, 30000); // Increase salary for developer
    }
}
