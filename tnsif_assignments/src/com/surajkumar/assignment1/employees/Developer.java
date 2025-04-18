package com.surajkumar.assignment1.employees;

public class Developer extends Employee {
    // Additional attribute specific to Developer
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary); // Call parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Getter and Setter for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Call parent method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

