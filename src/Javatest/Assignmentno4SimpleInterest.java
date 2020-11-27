package Javatest;

import java.util.Scanner;

public class Assignmentno4SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Principle value:");
		int n1 = input.nextInt();
		System.out.println("Enter the Time " + n1);
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int n4 = n1 * n2 * n3;
		int n5 = n4 / 100;
		System.out.println("Enter the Principle value:" + n1);
		System.out.println("Enter the Time " + n2);
		System.out.println("Enter the Rate: " + n3);
		System.out.println("Simple interest is " + n5);
		input.close();
	}

}
