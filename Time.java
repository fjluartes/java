// Exercise 2.3, 8/22/2016
// Time: This program displays the time in hours, minutes, seconds. 
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
	int hours, minutes, seconds, secondsSinceMidnight, secondsRemaining, dayPercentage;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter hours: ");
        hours = keyboard.nextInt();
        System.out.println("Enter minutes: ");
        minutes = keyboard.nextInt();
        System.out.println("Enter seconds: ");
        seconds = keyboard.nextInt();
        secondsSinceMidnight = (hours * 3600) + (minutes * 60) + seconds;
	secondsRemaining = 86400 - secondsSinceMidnight;
        dayPercentage = (secondsSinceMidnight * 100) / 86400; 
        System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds); 
        System.out.println("It is " + secondsSinceMidnight + " seconds since midnight.");
        System.out.println("There are " + secondsRemaining + " seconds remaining in the day."); 
        System.out.println(dayPercentage + "% of the day has passed.");
    }
}
