package com.surajkumar.assignment2.question3;
import java.util.Scanner;

class Circle {
    private double radius; // Data member for radius
    private String colour; // Data member for colour

    // Default constructor
    public Circle() {
        radius = 0;
        colour = "";
    }

    // Method to accept input
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        
        System.out.print("Enter the colour of the circle: ");
        colour = scanner.next();
    }

    // Method to calculate and display the area of the circle
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("The area of the circle is: %.2f\n", area);
    }

    // Method to display the details of the circle
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Colour: " + colour);
    }
}

class Main { // Corrected class name (capitalized)
    public static void main(String[] args) {
        Circle circle = new Circle(); // Create a Circle object
        
        // Use the methods of the Circle class
        circle.getInput();
        circle.display();
        circle.calcArea();
    }
}
