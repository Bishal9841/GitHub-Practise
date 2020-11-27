package Javatest;

import java.util.Scanner;

public class Assignmentno3UsingScannerclass {
	
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter First Number:");
			int a = input.nextInt();
			System.out.println("Enter Second Number:");
			int b = input.nextInt();
			int sum=a+b;
			int sub=a-b;
			float c= sum/2;
			int d=a*b;
			System.out.println("The Sum of the two number is: "+ sum);
			System.out.println("The sub of the two number is: "+ sub);
			System.out.println("The average of the two numbers is: "+ c);
			System.out.println("The product of two numbers is: "+d);
		}
		
	}

}
