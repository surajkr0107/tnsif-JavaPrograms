package com.surajkumar.assignment3;

public class AirIndia implements Airfare {
    private int hours; // Number of hours
    private double costPerHour; // Cost per hour

    // Default constructor
    public AirIndia() {
        hours = 0;
        costPerHour = 0.0;
    }

    // Parameterized constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Implementing calculateAmount method
    @Override
    public double calculateAmount() {
        return hours * costPerHour;
    }

    // Implementing display method
    @Override
    public void display() {
        System.out.printf("Air India - Hours: %d, Cost per hour: %.2f, Total Amount: %.2f%n", 
                          hours, costPerHour, calculateAmount());
    }
}

