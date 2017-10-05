// Fred Luartes, 9/8/2016
// MP13_StoredArray: Create a program that will let the user input 15 numbers using a FOR loop and storing each no. in an array variable named Stored. Then use another for loop to display all nos. in the even indexes of the array  *assuming that index[0] is also an even number*. Then, get these inputted numbers total. Then use another for loop to display the numbers in the odd indexes of the array. Then also get these numbers total value. *exclude index[0]*. The program will loop and will exit if the user wants to. Restriction is a must.

import java.util.Scanner;

public class MP13_StoredArray {
	public static void main(String[] args) {
		int[] stored = new int[16];
		int sumEven = 0, sumOdd = 0;
		String choice = "";
		Scanner keyboard = new Scanner(System.in);

		do {
			for (int i = 0; i < 16; i++) {
				System.out.println("Enter value in stored: ");
				stored[i] = keyboard.nextInt();
			}

			System.out.print("\nNumbers in the Even indexes are: ");

			for (int j = 0; j < 16; j += 2) {
				sumEven = sumEven + stored[j];
				System.out.print(" " + stored[j]);
			}
			System.out.println("\nTotal value (Even indexes): " + sumEven);

			System.out.print("\nNumbers in the Odd indexes are: ");
			for (int k = 1; k < 16; k += 2) {
				sumOdd = sumOdd + stored[k];
				System.out.print(" " + stored[k]);	
			}
			System.out.println("\nTotal value (Odd indexes): " + sumOdd);

			System.out.println("\nDo you want to enter again? [Y/N]: ");
			choice = keyboard.next();
		} while (choice.equals("Y") || choice.equals("y"));
	}
}