// 11/7/2016
// Fibonacci2: This program returns the nth number in the fibonacci sequence using a recursive function.
import java.util.Scanner;

public class Fibonacci2 {
    static int fib(int n) {
	return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter number of iterations: ");
	int num = keyboard.nextInt();
	for(int i = 0; i < num; i++) {
	    System.out.print(fib(i) + ", ");
	}
	System.out.println(fib(num));
    }
}
