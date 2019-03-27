package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		JOptionPane.showMessageDialog(null, "Hi, we meet again, what a Small World am I right. QUESTION TIME!!!");
		String name = JOptionPane.showInputDialog("HWO DO U HATE LOTS OF AMOUNTS???");

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "I STALK U EVERYDAY I KNOW U LUV" +name);
		// 3. Ask the user for the name of their best friend
		JOptionPane.showMessageDialog(null, "Hi, we meet again, what a Small World am I right. QUESTION AGAIN HAHAHAhAHA!!!");
		String nam = JOptionPane.showInputDialog("HWO BEST PERSON YOU LIK HUH???");

		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null,"DA PERSON WHO SWEET AS CANDY IIISSSSIS" +nam);
		JOptionPane.showMessageDialog(null,"BY DA WAY U STILL HAVE TO MARRY" +name);
		JOptionPane.showMessageDialog(null,"AND U ATE TOO MANY BANANAS");

	} 
}



