//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
int magic = new Random().nextInt(4);
JOptionPane.showInputDialog(magic);
if(magic == 0) {
	JOptionPane.showInputDialog("Yes");
}
if(magic == 1) {
	JOptionPane.showInputDialog("No");
}
if(magic == 2) {
	JOptionPane.showInputDialog("Maybe you should ask Google?");
}
if(magic == 3) {
	JOptionPane.showInputDialog("Well yes, but actually no, but yes no or no yes of the yes to the no of the yes and the no. You no? Yes, oh no");
}
	}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
