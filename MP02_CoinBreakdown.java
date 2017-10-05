// Fred Luartes, 8/29/2016
// MP2_CoinBreakdown: Write a program that produces a bill and coin breakdown for an amount of money. Initialize the amount in float variable known as dollars and use the cents variable to keep track of the amount not yet converted to bills and coins. You will have to make use of integer arithmetic and the remainder in this program. The program will loop and will exit if the user wants to. Restriction is a must.

import java.util.Scanner;

public class MP02_CoinBreakdown {
	public static void main(String[] args) {
		float dollars, remainingFifty, remainingTwenty, remainingTen, remainingFive, remainingOne;
		int dollarBills, fiftyCents, twentyCents, tenCents, fiveCents, oneCents;
		String choice = "";
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Enter dollars: ");
			dollars = keyboard.nextFloat();
	
			dollarBills = (int)dollars;
			remainingFifty = dollars - (float)dollarBills;
			fiftyCents = (int)(remainingFifty * 100) / 50;
			remainingTwenty = remainingFifty - (float)(0.50 * fiftyCents);
			twentyCents = (int)(remainingTwenty * 100) / 20;
			remainingTen = remainingTwenty - (float)(0.20 * twentyCents);
			tenCents = (int)(remainingTen * 100) / 10;
			remainingFive = remainingTen - (float)(0.10 * tenCents);
			fiveCents = (int)(remainingFive * 100) / 5;
			remainingOne = remainingFive - (float)(0.05 * fiveCents);
			oneCents = (int)(remainingOne * 100);
	
			System.out.println("*****************");
			System.out.println("The coin breakdown for $" + dollars + " is: ");
			System.out.println("Dollar Bills: " + dollarBills);
			System.out.println("Fifty cents: " + fiftyCents);
			System.out.println("Twenty cents: " + twentyCents);
			System.out.println("Ten cents: " + tenCents);
			System.out.println("Five cents: " + fiveCents);
			System.out.println("One cents: " + oneCents);

			System.out.println("\nDo you want to enter again? [Y/N]: ");
			choice = keyboard.next();
		} while(choice.equals("Y") || choice.equals("y"));
	}
}