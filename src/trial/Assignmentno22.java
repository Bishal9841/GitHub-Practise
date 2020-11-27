package trial;

import java.util.Scanner;

public class Assignmentno22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(x + "*" + i + "=" + x * i);

		}

	}

}
