package Javatest;



import javax.swing.JOptionPane;

public class Assignmentno17LeapYearr {

	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("Enter the Current Leap Year");
		double year=Double.parseDouble(s);
		int x=(int) year;
		x=x+4;
		JOptionPane.showMessageDialog(null,"The Next Lear Year: " +x);
	}

}
