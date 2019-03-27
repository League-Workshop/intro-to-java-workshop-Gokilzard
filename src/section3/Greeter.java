package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hi, we meet again, what a Small World am I right. QUESTION TIME!!!");
		String name = JOptionPane.showInputDialog("HOW MANY BANANAS DID U EAT IN YOUR LIFE???");

				JOptionPane.showMessageDialog(null, "PLEASE DONT TAKE MY BANANAS " +name  );
	}
}
