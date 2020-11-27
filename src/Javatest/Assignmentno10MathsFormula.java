package Javatest;

import java.util.Scanner;

public class Assignmentno10MathsFormula {

	public static void main(String[] args) {
		

			
				Scanner input=new Scanner(System.in);
				System.out.println("Enter a: ");
				double a=input.nextDouble();
				System.out.println("Enter b: ");
				double b=input.nextDouble();
				System.out.println("Enter c: ");
				double c=input.nextDouble();
				double x=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
				System.out.println("The value of polynomial is: "+x);
				input.close();
		}

		
	}


