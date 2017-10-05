// 10/30/2016
// FibonacciSequence: This program displays a fibonacci sequence given the number of iterations.
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1 = 0, num2 = 1, iter, sum = 0;
        System.out.println("Enter number of iterations: ");
        iter = keyboard.nextInt();
        for(int i = 1; i < iter; i++) {
	    System.out.println(sum);
	    sum = num1 + num2;
	    num1 = num2;
	    num2 = sum;
        }
	System.out.println(sum);
    }
}
