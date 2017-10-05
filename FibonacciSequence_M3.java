// Fred Luartes, 8/11/2016
// Fibonacci Sequence: This program accepts 2 numbers and will display a fibonacci sequence. (10 iterations)

import java.util.Scanner;

public class FibonacciSequence_M3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sum;

	System.out.println("Enter first number: ");
        num1 = keyboard.nextInt();
        System.out.println("Enter second number: ");
        num2 = keyboard.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        for(int i = 0; i < 8; i++) {		
	    sum = num1 + num2; 
	    System.out.println(sum);
	    num1 = num2;
	    num2 = sum;
	}
    }
}
