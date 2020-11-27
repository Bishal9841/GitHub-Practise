package Javatest;

import java.util.Scanner;

public class Assignmentno13Negativenumber {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter number: ");
			int n= input.nextInt();
			
			if(n <0) {//true
				System.out.println("You have entered negative number.");
				
			}
		}
		System.out.println("more code");
		System.out.println("exit");
	}
}
