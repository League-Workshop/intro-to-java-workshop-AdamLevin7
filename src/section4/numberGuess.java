package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class numberGuess {
	public static void main(String[] args) {
		int number = new Random().nextInt(1001);
		int num = 1001;
		while(num != number) {
			String guess = JOptionPane.showInputDialog(null, "Guess a whole number from 0 to 1000");
			int num = Integer.parseInt(guess);
			if (num > number) {
				JOptionPane.showMessageDialog(null, "Guess lower");
			}
			if (num < number) {
				JOptionPane.showMessageDialog(null, "Guess higher");
			}
		}
		if (num == number) {
			JOptionPane.showMessageDialog(null, "You win! Congratulations!");
		}
	}
	
}
