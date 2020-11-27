package Javatest;

import java.util.Scanner;

public class Assignmentno25Studentwithhighestscore {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of student: ");
		int numofStudent = input.nextInt();
		
		int maxScore =0;
		String studentName ="";
		
		for (int i =1; i <=numofStudent; i++) {
			System.out.println("Enter name of student: ");
			String name = input.next();
			System.out.println("Enter score a student: ");
			int score= input.nextInt();
			if(score > maxScore) {
				maxScore = score;
				studentName = name;		
			}
		}
		
		System.out.println("Student Name is: "+studentName);
		System.out.println("Max score is: "+maxScore);
        input.close();	}
}
