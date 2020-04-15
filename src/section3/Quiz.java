package section3;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		int score = 0;
		JOptionPane.showMessageDialog(null, "It be quiz time! Woooooooooo!");
		String One = JOptionPane.showInputDialog(null, "Question 1 \n What is the capital of California?");
		if (One.equals("Sacramento")) {
			score++;
		}
		String Two = JOptionPane.showInputDialog(null, "Question 2 \n Where is Washington D.C?");
		if (Two.equals("Maryland")) {
			score++;
		}
		String Three = JOptionPane.showInputDialog(null, "Question 3 \n What is 5-8/2?");
		if (Three.equals("1")) {
			score++;
		JOptionPane.showMessageDialog(null, "Your score was " + (score));
		}
	}

}
