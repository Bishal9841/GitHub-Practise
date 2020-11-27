package Javatest;

import java.util.Scanner;

public class Assignmentno7RadiusandlengthofCylinder {

	public static void main(String[] args) {
		//Identify Variables
		
		double radius;
		double area;
		double length;
		double volume;
		
		//Create a Scanner Object
		Scanner input = new Scanner(System.in);
		//Receive the inputs from the keyboard
		System.out.println("Enter the radius of a cylinder:");
		radius = input.nextDouble();
		System.out.println("Enter the length of a cylinder");
		length = input.nextDouble();
		
		//Calculating by using the given formula
		volume= radius *radius*3.1415*length;
		
		//Display the results
		System.out.println("The volume is " + volume);
		input.close();
	}

}
