//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for (int x = 0; x < 10; x+=1) {
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		if (randomNumber == 1) {
			System.out.print("You are looking good today.");
		}
		if (randomNumber == 2) {
			System.out.print("You are smart.");
		}
		if (randomNumber == 3) {
			System.out.print("You are good at video games.");
		}
		if (randomNumber == 4) {
			System.out.print("You are awesome.");
		}
		if (randomNumber == 0) {
			System.out.print("You are good at programming.");
		}
		}





		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
