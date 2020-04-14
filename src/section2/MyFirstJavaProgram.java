package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot bob = new Robot();
	bob.setWindowColor(255, 100, 255);
	bob.penDown();
	bob.setPenColor(0, 255, 255);
	bob.setSpeed(100);
	for (int i = 0; i < 6; i++) {
		bob.move(100);
		bob.turn(360/6);
	}
	
		
		
	}
}
