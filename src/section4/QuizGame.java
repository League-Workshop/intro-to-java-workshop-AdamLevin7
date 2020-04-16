package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		// 2.  Ask the user a question 
		String One = JOptionPane.showInputDialog(null, "What is 5+7/2*10?");
		
		if (One.equals("85")) {
			score++;
		
		String Two = JOptionPane.showInputDialog(null, "What is the capital of Spain?");
			
		if (Two.equals("Madrid")) {
			score++;
		String Three = JOptionPane.showInputDialog(null, "What bird won a war against Australia(write in singular form first letter capitalized)");
			
		if (Three.equals("Emu")) {
			score++;
		JOptionPane.showMessageDialog(null, "Your score is a grand total of " + (score));
		}
		
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		}
		
	}
}
}
