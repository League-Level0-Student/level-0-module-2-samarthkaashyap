package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
String inputage = JOptionPane.showInputDialog(null, "How old are you?");
int Inputint = Integer.parseInt(inputage);
if(Inputint > 18) {
	String input = JOptionPane.showInputDialog(null, "Who do you think the next president should be?");
}
else {
	JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
}
	
	
	
	
	
	
	
}
}
