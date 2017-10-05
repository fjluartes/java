//Fred Luartes, 8/17/2016
// Number Guessing Game: This program asks the user to guess a number from 1-100. The program indicates if the guess is higher or lower than the number. The user guesses until he gets the correct answer and the program displays the number of tries.

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame_M5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int number = 1 + r.nextInt(100);
		int count = 1; 

		System.out.println("Pick a number from 1 to 100: ");
		int guess = keyboard.nextInt();

		do {
			if(guess < number) {
				System.out.println("Your guess is low! Guess again: ");
				guess = keyboard.nextInt();
			}
			else if(guess > number) {
				System.out.println("Your guess is high! Guess again: ");
				guess = keyboard.nextInt();	
			}
			count++;
		} while(guess != number);
		System.out.println("That is correct! You guessed it in " + count + " tries.");
	}
}