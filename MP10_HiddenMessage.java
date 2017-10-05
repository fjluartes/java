// Fred Luartes, 9/12/2016
// MP10_HiddenMessage: Create a program that will display the hidden message. Restriction is a must. Use this mapping below as your reference. Restriction is a MUST! :)

import java.util.Scanner;

public class MP10_HiddenMessage {
	public static void main(String[] args) {
		String choice = "", message;
		Scanner keyboard = new Scanner(System.in);

		do {
			char[][] newAlphabet = new char[2][26];
			newAlphabet[0] = "!@#$%^&*()-_+={}:;|><?/[].".toCharArray();
			newAlphabet[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
			System.out.println("Enter message: ");
			message = keyboard.nextLine();

			char[] stringToChar = message.toCharArray();

			for (int i = 0; i < message.length(); i++) {
				for (int j = 0; j < 26; j++) {
					if (stringToChar[i] == newAlphabet[0][j]) {
						stringToChar[i] = newAlphabet[1][j];
					}
				}
			} 
			System.out.println(stringToChar);

			System.out.println("Do you want to enter again? [Y/N]: ");
			choice = keyboard.nextLine();
		} while (choice.equals("Y") || choice.equals("y"));
	}
}