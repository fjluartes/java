// Fred Luartes, 8/31/2016
// MP7_Grades: Write a program to assign a letter grade given a numeric score: 90 or above is an a; 80, B; 70, C; 60, D; and below 60, F. The program should continue to accept until a negative number is input. The program should continue to accept values until a negative number is input. The program should print how many of each letter grade were assigned after the input is completed. Use else if construct in construct in your program.

import java.util.Scanner;

public class MP07_Grades {
	public static void main(String[] args) {
		int score, a = 0, b = 0, c = 0, d = 0, f = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Score? ");
		score = keyboard.nextInt();

		while (score > -1) {
			if (score >= 90 && score <= 100) {
				System.out.println("THE GRADE IS A");
				a++;
			}
			else if (score >= 80 && score < 90) {
				System.out.println("THE GRADE IS B");
				b++;
			}
			else if (score >= 70 && score < 80) {
				System.out.println("THE GRADE IS C");
				c++;
			}
			else if (score >= 60 && score < 70) {
				System.out.println("THE GRADE IS D");
				d++;
			}
			else if (score >= 0 && score < 60) {
				System.out.println("THE GRADE IS F");
				f++;
			}
			else {
				System.out.println("That's not a valid grade!");
			}
			System.out.println("Score? ");
			score = keyboard.nextInt();
		}
		System.out.println("*****************");
		System.out.println("COUNTER: ");
		System.out.println("A's 	" + a);
		System.out.println("B's 	" + b);
		System.out.println("C's 	" + c);
		System.out.println("D's 	" + d);
		System.out.println("F's 	" + f);
	}
}