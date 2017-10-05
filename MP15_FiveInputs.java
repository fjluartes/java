// Fred Luartes, 9/12/2016
// MP15_FiveInputs: Create a program that will read the 5 inputs from the user. It can be an alphanumeric. Then it will check if the input is a String, number or a letter(character). If it's a String it will count its length and display the ASCII CODE of every letter. If it's a number it will display its ASCII CODE Value and the number before it. If it's a letter(character) it will display the next letter of it. RESTRICTION is optional. Make it LOOP.

import java.util.Scanner;

class Test {
    static boolean numberOrNot(String input) {
    	try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex) {
            return false;
        }
        return true;
    }
}

public class MP15_FiveInputs {
	public static void main(String[] args) {
		String choice = "";
		Scanner keyboard = new Scanner(System.in);

		do {
			String[] input = new String[5];

			for (int i = 0; i < 5; i++) {
				System.out.println("Enter input #" + (i + 1) + ": ");
				input[i] = keyboard.nextLine();
			}
			
			for (int l = 0; l < 5; l++) {
				int number, count = input[l].length();
				char letter, letterLower, letterUpper;
				char[] stringToChar = new char[count];
				int[] ascii = new int[count];
				String[] charToString = new String[count];
	
				System.out.println("\nInput # " + (l + 1) + ": " + input[l]);
				if (Test.numberOrNot(input[l])) {
					for (int j = 0; j < count; j++) {
						stringToChar[j] = input[l].charAt(j);
						charToString[j] = Character.toString(stringToChar[j]);
						ascii[j] = (int)stringToChar[j];
						System.out.print(stringToChar[j] + " = " + ascii[j] + "    ");
					}
					number = Integer.parseInt(input[l]);
					System.out.println("\nNumber before " + number + " is " + (number - 1));
				}
				else if (count == 1 && Character.isLetter(input[l].charAt(0))) {
					letter = input[l].charAt(0);
					letterLower = (char) (((letter - 'a' + 1) % 26) + 'a');
					letterUpper = (char) (((letter - 'A' + 1) % 26) + 'A');
					if (Character.isLowerCase(letter)) {
						System.out.println("After " + letter + " is " + letterLower);
					}
					else if (Character.isUpperCase(letter)) {
						System.out.println("After " + letter + " is " + letterUpper);	
					} 
				}
				else {
					System.out.println("Length: " + count);
	
					for (int k = 0; k < count; k++) {
						stringToChar[k] = input[l].charAt(k);
						charToString[k] = Character.toString(stringToChar[k]);
						ascii[k] = (int)stringToChar[k];
						System.out.print(stringToChar[k] + " = " + ascii[k] + "    ");
					}
				}
			}
			System.out.println("\nDo you want to enter again? [Y/N]: ");
			choice = keyboard.nextLine();
		} while (choice.equals("Y") || choice.equals("y"));
	}
}