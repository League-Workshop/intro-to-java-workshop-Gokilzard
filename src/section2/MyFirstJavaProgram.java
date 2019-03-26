package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot yeetmalik = new Robot();
		yeetmalik.penDown();
		yeetmalik.setSpeed(100);
		for(int i=0;i<4;i++) {
		yeetmalik.move(200);
		yeetmalik.turn(90);
		}
		
		
		
		
	
		
		
	}
}
