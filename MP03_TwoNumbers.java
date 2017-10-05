// Fred Luartes, 8/29/2016
// MP3_TwoNumbers: Write a program that accepts two numbers and prints the following information below. The program will loop and will exit if the user wants to. Restriction is a must.

import java.util.Scanner;

public class MP03_TwoNumbers {
	public static void main(String[] args) {
		int first, second, remainder;
		double quotient;
		String choice = "";
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("Enter first number: ");
			first = keyboard.nextInt();
			System.out.println("Enter second number: ");
			second = keyboard.nextInt();
	
			while (second > first) {
				System.out.println("Second number should be less than the first.");
				System.out.println("Enter second number: ");
				second = keyboard.nextInt();
			}

			remainder = first % second;
			quotient = (double)first / (double)second; 
	
			System.out.println("The first number is " + first);
			System.out.println("The second number is " + second);
			System.out.println("The second number goes into the first " + (int)quotient + " times with a remainder of " + remainder);
			System.out.println("The quotient is " + quotient);

			System.out.println("\nDo you want to enter again? [Y/N]: ");
			choice = keyboard.next();
		} while(choice.equals("Y") || choice.equals("y"));
	}
}