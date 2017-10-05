// Fibonacci Sequence: This program displays the nth fibonacci number.
import java.util.Scanner;

public class Fibonacci3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");
        num = keyboard.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println("");
    }
    
    public static int fib(int n) {
        int result = n;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        return result;
    }
}
