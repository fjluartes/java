// PC07: Fibonacci
import java.util.Scanner;

public class PC07_Fibonacci {
    public static int fib(int n) {
        int result;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = k.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println("");
    }
}
