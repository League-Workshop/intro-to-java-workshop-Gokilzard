package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
	
		
		// 2.  Ask the user a question 
				String name = JOptionPane.showInputDialog("WHAT IS MEH PASSWORD???");
		
		// 3.  Use an if statement to check if their answer is correct
				if(name.equals("Gullible")) {
				score=score+1;
				}
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
				System.out.print(score);
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
				JOptionPane.showMessageDialog(null,"KNOcK KCOnk");
				JOptionPane.showMessageDialog(null,"Whos Ther");
				String nam = JOptionPane.showInputDialog("Whos Ther");
				JOptionPane.showMessageDialog(null, "The one to suck your soul will be..."+nam);
				score=score+1;
		
		// 6.  After all the questions have been asked, print the user's score 
				
		
	
}}
