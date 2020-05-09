//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(6);
				
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber == 0) {
		 JOptionPane.showInputDialog("You're a star!");
		}
		if(randomNumber == 1) {
		JOptionPane.showInputDialog("You rock!");
		}
		if(randomNumber == 2) {
		JOptionPane.showInputDialog("Nice hair!");
		}
		if(randomNumber == 3) {
		 JOptionPane.showInputDialog("Awesome Looks!");
		}
		if(randomNumber == 4) {
		 JOptionPane.showInputDialog("You're amazing!");
		}
		if(randomNumber == 5) {
		 JOptionPane.showInputDialog("You deserve a scholarship!");
		}
		}
		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
