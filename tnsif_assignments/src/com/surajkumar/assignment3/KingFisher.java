package com.surajkumar.assignment3;

public class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;

    // Default constructor
    public KingFisher() {
        hours = 0;
        costPerHour = 0.0;
    }

    // Parameterized constructor
    public KingFisher(int hours, double costPerHour) {
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

    // Implementing calculateAmount method (multiplied by 4)
    @Override
    public double calculateAmount() {
        return 4 * hours * costPerHour;
    }

    // Implementing display method
    @Override
    public void display() {
        System.out.printf("King Fisher - Hours: %d, Cost per hour: %.2f, Total Amount: %.2f%n", 
                          hours, costPerHour, calculateAmount());
    }
}
