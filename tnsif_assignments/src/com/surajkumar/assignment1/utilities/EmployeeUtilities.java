package com.surajkumar.assignment1.utilities;

import com.surajkumar.assignment1.employees.Employee;
import com.surajkumar.assignment1.employees.Manager;
import com.surajkumar.assignment1.employees.Developer;

/**
 * Provides utility methods to handle Employee objects.
 * Demonstrates proper usage of access modifiers for encapsulation.
 */
public class EmployeeUtilities {

    /**
     * Displays the basic details of any Employee object.
     *
     * @param employee The Employee object whose details will be displayed.
     */
    public void displayBasicDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Increases the salary of the given employee.
     * Protected access ensures this method can be reused in subclasses or related classes.
     *
     * @param employee The Employee whose salary is to be increased.
     * @param increment The amount to increase the salary by.
     */
    public void increaseSalary(Employee employee, double increment) {
        double newSalary = employee.getSalary() + increment;
        employee.setSalary(newSalary);
        System.out.println("Salary increased for " + employee.getName() + ". New salary: " + newSalary);
    }

    /**
     * Provides additional details for Manager objects.
     * Restricted to Manager type objects to ensure specific usage.
     *
     * @param manager The Manager object whose team details will be displayed.
     */
    public void displayManagerDetails(Manager manager) {
        displayBasicDetails(manager);
        System.out.println("Team Size: " + manager.getTeamSize());
    }

    /**
     * Provides additional details for Developer objects.
     * Restricted to Developer type objects to ensure specific usage.
     *
     * @param developer The Developer object whose programming details will be displayed.
     */
    public void displayDeveloperDetails(Developer developer) {
        displayBasicDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}