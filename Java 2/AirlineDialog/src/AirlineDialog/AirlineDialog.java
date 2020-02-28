package AirlineDialog;
import javax.swing.JOptionPane;

public class AirlineDialog {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selection;
		boolean isYes;
		
		selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?");
		isYes = (selection == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "You responded " + isYes);		
	}
}