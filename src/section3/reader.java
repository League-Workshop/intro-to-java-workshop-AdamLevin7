package section3;

import javax.swing.JOptionPane;

public class reader {
	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog(null, "What is your name?");
		
		JOptionPane.showMessageDialog(null,"Hello "+ (name));
		
		if(name.equals("Adam")){
			JOptionPane.showMessageDialog(null, "You are cool yay");
		}
		else {
			JOptionPane.showMessageDialog(null, "You exist");
				
		}
	}
}
