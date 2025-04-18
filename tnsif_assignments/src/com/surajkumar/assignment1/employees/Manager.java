package com.surajkumar.assignment1.employees;

	public class Manager extends Employee {
	    // Additional attribute specific to Manager
	    private int teamSize;

	    // Constructor
	    public Manager(String name, int employeeId, double salary, int teamSize) {
	        super(name, employeeId, salary); // Call parent class constructor
	        this.teamSize = teamSize;
	    }

	    // Getter and Setter for teamSize
	    public int getTeamSize() {
	        return teamSize;
	    }

	    public void setTeamSize(int teamSize) {
	        this.teamSize = teamSize;
	    }

	    // Optional: A method to display manager details
	    @Override
	    public void displayEmployeeDetails() {
	        super.displayEmployeeDetails(); // Call parent method
	        System.out.println("Team Size: " + teamSize);
	    }
	}


