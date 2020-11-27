package Javatest;

import java.util.Scanner;

public class Assignmentno31DisplayProgramme {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print(j+" ");
				input.close();
				
			}
		}
			System.out.println();
			input.close();
		}
		
	
}
