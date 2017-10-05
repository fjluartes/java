// Fred Luartes, 8/29/2016
// MP5_CoinsTotalValue: Write a program that will accept keyboard input of various coins and return the total value. The program will loop and will exit if the user wants to. Restriction is a must.

import java.util.Scanner;

public class MP05_CoinsTotalValue {
	public static void main(String[] args) {
		int fifty, twenty, ten, five, one;
		double fiftyAmt, twentyAmt, tenAmt, fiveAmt, oneAmt, total; 
		String choice = "";
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Fifty cents? ");
			fifty = keyboard.nextInt();
			System.out.println("Twenty cents? ");
			twenty = keyboard.nextInt();
			System.out.println("Ten cents? ");
			ten = keyboard.nextInt();
			System.out.println("Five cents? ");
			five = keyboard.nextInt();
			System.out.println("One cents? ");
			one = keyboard.nextInt();
	
			fiftyAmt = 0.50 * fifty;
			twentyAmt = 0.20 * twenty;
			tenAmt = 0.10 * ten;
			fiveAmt = 0.05 * five;
			oneAmt = 0.01 * one;
			total = fiftyAmt + twentyAmt + tenAmt + fiveAmt + oneAmt;

			System.out.println("*****************");
			System.out.println("Your total is $" + total);

			System.out.println("\nDo you want to enter again? [Y/N]: ");
			choice = keyboard.next();
		} while(choice.equals("Y") || choice.equals("y"));
	}
}