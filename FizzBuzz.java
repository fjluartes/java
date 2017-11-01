// FizzBuzz
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i, length;
        
        System.out.println("Enter number: ");
        length = keyboard.nextInt();

        for (i = 1; i <= length; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
