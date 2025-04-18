package com.surajkumar.assignment3;

public class Main {
	public static void main(String[] args) {
        // Create AirIndia object
        AirIndia airIndia = new AirIndia(5, 200.50);
        airIndia.display();

        // Create KingFisher object
        KingFisher kingFisher = new KingFisher(3, 150.75);
        kingFisher.display();

        // Create Indigo object
        Indigo indigo = new Indigo(4, 100.25);
        indigo.display();
    }
}
