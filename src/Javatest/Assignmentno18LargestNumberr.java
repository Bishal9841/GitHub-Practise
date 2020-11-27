package Javatest;

import javax.swing.JOptionPane;

public class Assignmentno18LargestNumberr {

	/**
	 * Java@Vastika 2020
	 * 
	 * @author Bishal Bhandari Display the largest Number from given three values
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Enter the First Number: ");
		String s2 = JOptionPane.showInputDialog("Enter the Second Number: ");
		String s3 = JOptionPane.showInputDialog("Enter the Third Number: ");
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		double n3 = Double.parseDouble(s3);
		if (n1 > n2 && n1 > n3) {
			JOptionPane.showMessageDialog(null, n1 + " is the Greatest.");

		}
		if (n2 > n1 && n2 > n3) {
			JOptionPane.showMessageDialog(null, n2 + " is the Greatest.");
		} else {
			JOptionPane.showMessageDialog(null, n3 + " is the Greatest");
		}
	}

}
