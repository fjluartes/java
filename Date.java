// Fred Luartes, 8/22/2016
// Date (Exercise 2.2): This program displays the date in American and European formats. 

import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
		int date, year;
		String month, day;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter month: ");
		month = keyboard.next();
		System.out.println("Enter date: ");
		date = keyboard.nextInt();
		System.out.println("Enter year: ");
		year = keyboard.nextInt();
		System.out.println("Enter day: ");
		day = keyboard.next();

		System.out.println("American format: ");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European format: ");
		System.out.println(day + ", " + date + " " + month + ", " + year);
	}
}