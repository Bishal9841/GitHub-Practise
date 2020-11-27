package Javatest;

import java.util.Scanner;

public class Assignmentno6PerimeterofCRT {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Printing Perimeter of Circle");
		double r=3.14;
		double p=2*Math.PI*r*r;
		System.out.println("Perimeter of circle:"+p);
		System.out.println("Enter for slides of Triangle");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int z=a+b+c;
		System.out.println("Perimeter of circle:"+z);
		System.out.println("Printing Perimeter of a Rectangle");
		int I=input.nextInt();
		int W=input.nextInt();
		int o=2*(I+W);
		System.out.println("Perimeter of Rectangle is:"+o);
		input.close();
		
		

	}

}
