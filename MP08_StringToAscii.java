// Fred Luartes, 9/2/2016
// MP8_StringToAscii: Create a program that will let the user input letters and numbers. Then the program will display the designated ASCII code for each inputted letters and numbers. Then you will get the sum and average. The program must loop. The program must count user's input. Restriction is a must. :)

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

public class MP08_StringToAscii {
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
			int[] ascii = new int[count];
			String[] charToString = new String[count];
			System.out.print("ASCII Code: ");
			
			for (int i = 0; i < count; i++) {
				stringToChar[i] = s.charAt(i);
				charToString[i] = Character.toString(stringToChar[i]);
				ascii[i] = (int)stringToChar[i];
				sum = sum + ascii[i];
				System.out.print(stringToChar[i] + " = " + ascii[i] + "    ");
				
				if (Test.numberOrNot(charToString[i])) {
					numberCount++;
				}
			}
			average = (double)sum / count;
			System.out.println("\nSum: " + sum);
			System.out.println("Average: " + average);
			
			System.out.println("Number of times you input numbers: " + numberCount);
			System.out.println("Do you want to enter again? [Y/N]: ");
			choice = keyboard.nextLine();
		} while (choice.equals("Y") || choice.equals("y"));
	}
}