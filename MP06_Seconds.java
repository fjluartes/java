// Fred Luartes, 8/28/2016
// MP6_Seconds: Write a program that accepts a number of seconds from the keyboard and converts it into days, hours, minutes, and seconds. Use integer arithmetic and the remainder operator. The program will loop and will exit if the user wants to. Restriction is a must.

import java.util.Scanner;

public class MP06_Seconds {
	public static void main(String[] args) {
		int seconds, minutes, hours, days, hoursRemaining, minutesRemaining, secondsRemaining;
		String choice = "";
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("How many seconds? ");
			seconds = keyboard.nextInt();
	
			days = seconds / 86400;
			hoursRemaining = (seconds - (86400 * days));
			hours = hoursRemaining / 3600;
			minutesRemaining = (seconds - (86400 * days) - (3600 * hours));
			minutes = minutesRemaining / 60;
			secondsRemaining = (seconds - (86400 * days) - (3600 * hours) - (60 * minutes));
	
			System.out.println("*****************");
			System.out.println("Day/s: " + days);
			System.out.println("Hour/s: " + hours);
			System.out.println("Minutes: " + minutes);
			System.out.println("Seconds: " + secondsRemaining);

			System.out.println("\nDo you want to enter again? [Y/N]: ");
			choice = keyboard.next();
		} while(choice.equals("Y") || choice.equals("y"));
	}
}