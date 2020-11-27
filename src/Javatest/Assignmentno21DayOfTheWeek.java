package Javatest;
import javax.swing.JOptionPane;

public class Assignmentno21DayOfTheWeek {

	public static void main (String[] args) {
		
	
				String s=JOptionPane.showInputDialog("Enter the number(1....7): ");
				int n=Integer.parseInt(s);
				switch(n) {
				case 1:
					JOptionPane.showMessageDialog(null," Sunday");break;
				case 2:
					JOptionPane.showMessageDialog(null," Monday");break;
				case 3:
					JOptionPane.showMessageDialog(null," Tuesday");break;
				case 4:
					JOptionPane.showMessageDialog(null," Wednesday");break;
				case 5:
					JOptionPane.showMessageDialog(null," Thursday");break;
				case 6:
					JOptionPane.showMessageDialog(null," Friday");break;
				case 7:
					JOptionPane.showMessageDialog(null," Saturday");break;
				default:
					JOptionPane.showMessageDialog(null,"                ERROR!\nINSERT THE VALID NUMBER");
				}
				
				
			}

		

	}


