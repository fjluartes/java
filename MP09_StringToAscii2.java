// Fred Luartes, 9/4/2016
// MP9_StringToAscii2: Create a program that will let the user input numbers. If the ASCII value of the number is ODD, the program will display the ASCII Code of the number and a message, "ASCII value is Odd" otherwise will display "ASCII value is Even". After that the program will get the sum and average of the inputted numbers NOT the ASCII value, okay? :) xD Restriction is a MUST. :)

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

public class MP09_StringToAscii2 {
	public static void main(String[] args) {
		String s, choice = ""; 
		Scanner keyboard = new Scanner(System.in);
		
		do {
			int sum = 0, numberCount = 0;
			double average;
			System.out.println("Enter string: ");
			s = keyboard.nextLine();
			
			int count = s.length();
			char[] stringToChar = new char[count];
			String[] charToString = new String[count];
			int[] charToInt = new int[count];
			int[] ascii = new int[count];
			
			for (int i = 0; i < count; i++) {
				stringToChar[i] = s.charAt(i);
				charToString[i] = Character.toString(stringToChar[i]);
				ascii[i] = (int)stringToChar[i];
				charToInt[i] = Character.getNumericValue(stringToChar[i]);
				sum = sum + charToInt[i];
				if (ascii[i] % 2 == 0) {
					System.out.println(stringToChar[i] + " = " + ascii[i] + "    ASCII value is Even");
				}
				else {
					System.out.println(stringToChar[i] + " = " + ascii[i] + "    ASCII value is Odd");
				}
				
				if (Test.numberOrNot(charToString[i])) {
					numberCount++;
				}
			}
			average = (double)sum / count;
			System.out.println("\nSum is: " + sum);
			System.out.println("Average: " + average);

			System.out.println("Number of times you input numbers: " + numberCount);
			System.out.println("Do you want to enter again? [Y/N]: ");
			choice = keyboard.nextLine();
		} while (choice.equals("Y") || choice.equals("y"));
	}
}