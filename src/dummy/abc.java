package dummy;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		
		findEvenOdd();
		
	}
public static void findEvenOdd(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number");
	int x = input.nextInt();
	if(x%2==0) {
		System.out.println("Even");
	}
	else {
		System.out.println("ODD");
	}
	
	
	
	
	
}
}
