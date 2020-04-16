package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int num = new Random().nextInt(4);

	// 3. Print out this variable
		System.out.println(num);

	// 4. Get the user to enter something that they think is awesome
		String cool = JOptionPane.showInputDialog(null, "Write something you think is awesome");

	// 5. If the random number is 0
		if (num == 0) {
			JOptionPane.showMessageDialog(null, (cool) + " is awesome you have good taste");
		}
		if (num == 1) {
			JOptionPane.showMessageDialog(null, (cool) + " is ok you have... eh... taste buds");
		}
		if (num == 2) {
			JOptionPane.showMessageDialog(null, (cool) + " is the big dumb you stupid");
		}
		if (num == 3){
			JOptionPane.showMessageDialog(null, (cool) + " does exist so that's something.");
		}

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer
	}

}


