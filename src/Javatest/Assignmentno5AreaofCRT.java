package Javatest;

import javax.swing.JOptionPane;

public class Assignmentno5AreaofCRT {

	public static void main(String[] args) {
		// Area of circle, rectangle and Triangle
		final double PI = Math.PI;
		
		String r =JOptionPane.showInputDialog("Enter radius;");
		double radius = Double.parseDouble(r);
		
		double areaofCircle = PI * radius *radius;
		JOptionPane.showMessageDialog(null, "Area of circle is:" +areaofCircle);;
		System.out.println();

	}

}
