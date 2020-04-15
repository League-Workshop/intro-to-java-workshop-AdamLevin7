package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String dominate = JOptionPane.showInputDialog(null, "Do you are know how to write code?");

		// 2. If they say "yes", tell them they will rule the world.
		if (dominate.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "You shall dominate world >:D");
		}

		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null, "You are have stupid you shall wash dishes >:(");
			}
		}

	}


