package Javatest;

import java.util.Scanner;

public class Assignmentno9PoundstoKg {

	public static void main(String[] args) {
		//Assignment question  pounds to kilograms
		//Declare variables
		
		double pounds;
		double kilograms;
		
		//Create a scanner object
		Scanner input = new Scanner (System.in);
		
		//Receive inputs from keyboard
		System.out.println("Enter a number in pounds");
		pounds = input.nextDouble();
		
		//Compute Kilograms
		//one pound is 0.454 kilograms
		kilograms = pounds * 0.454;
		
		//Display result
		System.out.println(pounds + "is"+ kilograms+ "kilograms");
		input.close();
		
	}

}
