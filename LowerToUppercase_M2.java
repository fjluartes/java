// Fred Luartes, 8/10/2016
// LowerToUppercase: This program accepts only lowercase letters, and display it in uppercase. 

import java.util.Scanner;

public class LowerToUppercase_M2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String letter = "";
		char check;

		System.out.println("Enter a lowercase letter: ");
		letter = keyboard.nextLine();
		check = letter.charAt(0);

		while (Character.isUpperCase(check)) {
			System.out.println("Only lowercase letters are allowed.");
			System.out.println("Enter a lowercase letter: ");
			letter = keyboard.nextLine();
			check = letter.charAt(0);
		}
		System.out.println(letter.toUpperCase());
	}
}