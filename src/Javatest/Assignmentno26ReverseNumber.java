package Javatest;

import java.util.Scanner;

public class Assignmentno26ReverseNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int originalNumber = input.nextInt();//456
		
		int reverseNumber =0;
		System.out.println("Original number is: " + originalNumber);
		while (originalNumber !=0) {
			int temp = originalNumber % 10;//reminder 4
			reverseNumber = reverseNumber * 10 + temp;//654
			originalNumber = originalNumber / 10;// quotient 0
		}
		
		System.out.println("Reversed Number is: " + reverseNumber);
		input.close();

	}

}
