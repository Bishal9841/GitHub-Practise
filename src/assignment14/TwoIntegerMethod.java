package assignment14;

import java.util.Scanner;

public class TwoIntegerMethod {

	public static void relateTwoIntegers() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st No: ");
		int x = input.nextInt();
		System.out.println("Enter the 2nd No; ");
		int y = input.nextInt();
		if (x == y) {
			System.out.println("The two number are equal: ");
		}
		if (x > y) {
			System.out.println(x + " is greater than " + y);
		}
		if (y > x) {
			System.out.println("Y is greater than X: ");
			input.close();

		}

	}

	// Method
	public static void main(String[] args) {
		relateTwoIntegers();
	
	}
}
