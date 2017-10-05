// Fred Luartes, 9/5/2016
// MP12_StringInReverse: Create a program that will let the user input a word and then display the word in reverse using a for loop. If the program encounters a vowel in lower case convert it to uppercase. If it encounters a vowel in uppercase convert it to lowercase. The program will loop and will exit if the user wants to. Restriction is a must.

import java.util.Scanner;

public class MP12_StringInReverse {
	public static void main(String[] args) {
		String s, choice = "";
		int count, j;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("Enter word: ");
			s = keyboard.next();

			count = s.length();
			j = count - 1;
			char[] stringToChar = s.toCharArray();
			char temp;
			
			for (int i = 0; i < j; i++) {
				temp = stringToChar[i];
				stringToChar[i] = stringToChar[j];
				stringToChar[j] = temp;
				j--;
			}
			for (int k = 0; k < count; k++) {
				if (isLowerCaseVowel(stringToChar[k])) {
					stringToChar[k] = Character.toUpperCase(stringToChar[k]);
				}
				else if (isUpperCaseVowel(stringToChar[k])) {
					stringToChar[k] = Character.toLowerCase(stringToChar[k]);
				}
			}
			System.out.println(stringToChar);
			System.out.println("\nDo you want to enter again? [Y/N]: ");
			choice = keyboard.next();
		} while (choice.equals("Y") || choice.equals("y"));
	}
	
	public static boolean isLowerCaseVowel(char c) {
		return "aeiou".indexOf(c) != -1;
	}
	
	public static boolean isUpperCaseVowel(char c) {
		return "AEIOU".indexOf(c) != -1;
	}
}