// 10/22/2016
// Factorial: This program returns the factorial of a number N using iteration.

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int num, fac = 1;
	
	System.out.println("Enter number: ");
	num = keyboard.nextInt();

	for(int i = 1; i <= num; i++) {
	    fac = fac * i;
	}
	System.out.println(num + "! is equal to " + fac);
    }
}
