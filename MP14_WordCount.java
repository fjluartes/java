// Fred Luartes, 9/11/2016
// MP14_WordCount: Make a program that will count how many words are there in the inputted string.  The program will loop and will exit if the user wants to. Restriction is a must.

import java.util.Scanner;

public class MP14_WordCount {
	public static void main(String[] args) {
		String s, choice = "";
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Enter string: ");
			s = keyboard.nextLine();

			int wordCount = 0;
			int endOfLine = s.length() - 1;
			boolean word = false;

			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
					word = true;
				}
				else if (!Character.isLetter(s.charAt(i)) && word) {
					wordCount++;
					word = false;
				}
				else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
					wordCount++;
				}
			}
			System.out.println("There are " + wordCount + " words in this string.");

			System.out.println("Do you want to enter again? [Y/N]: ");
			choice = keyboard.nextLine();
		} while (choice.equals("Y") || choice.equals("y"));
	}
}
