// Binary Search, 10/20/2016
// Guess the number from 1-100 using binary search.
import java.util.Scanner;
import java.util.Random;

class BinarySearch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int i, j, count, guess, size = 100;
        int number = 1 + r.nextInt(size);

        i = 1; j = size; count = 0;
        guess = (i + j) / 2;
        while (guess != number) {
	    if (guess < number) {
	        i = guess;
	    } else if (guess > number) {
	        j = guess;
	    }
	    guess = (i + j) / 2;
	    count++;
	    System.out.println("Guess: " + guess);
	    System.out.println("Try count: " + count);
        }
        System.out.println("Number is: " + number);
        System.out.println("The guess is: " + guess);
        System.out.println("Number of tries: " + count);
    }
}
