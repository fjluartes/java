/** 11/8/2016
 * This program demonstrates the enum (enumerated type).
 * enum <enum-type-name> { <list-of-enum-values> }
 */

public class EnumDemo {
    // Define two enum types
    // go Outside the main() routine!

    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
    enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }
    
    public static void main(String[] args) {
	// Declare variables for Day and Month.
	Day tgif;     
	Month libra;  

	// Assign values of type Day to tgif and of type Month to libra.
	tgif = Day.FRIDAY;
	libra = Month.OCT;
	
	System.out.print("My sign is libra since I was born in ");
	System.out.println(libra);
	System.out.print("That's the ");
	System.out.print(libra.ordinal());
	System.out.println("th month of the year.");
	System.out.println("  (Counting from 0 of course!)");

	System.out.print("Isn't it nice to get to ");
	System.out.println(tgif);
	System.out.println(tgif + " is the " + tgif.ordinal() + "th day of the week");
    }
}
