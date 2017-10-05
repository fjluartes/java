// Fred Luartes, 8/10/2016
// OddOrEven: This program accepts a number and will determine if it's odd or even. Then the process will loop for 5 times.

import java.util.Scanner;

public class OddOrEven_M1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;

		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a number: ");
			number = keyboard.nextInt();
			if (number % 2 == 0) {
				System.out.println("Number is even.");
			}
			else {
				System.out.println("Number is odd.");
			}
		}
	}
}