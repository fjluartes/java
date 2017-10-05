// PC02: Convert to Seconds
import java.util.Scanner;

public class PC02_ConvertToSeconds {
    public static int toSeconds(int years, int months) {
        int seconds, totalAge;
        totalAge = (years * 12) + months;
        seconds = 2628000 * totalAge;
        return seconds;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter your age in years: ");
        int y = k.nextInt();
        System.out.println("Enter remaining months before your next birthday: ");
        int m = k.nextInt();
        System.out.println("Your age in seconds is " + toSeconds(y, m));
    }
}
