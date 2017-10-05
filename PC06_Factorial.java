// PC06: Factorial
import java.util.Scanner;

public class PC06_Factorial {
    public static int fac(int n) {
        int result;
        if (n == 0) {
            result = 1;
        } else {
            result = n * fac(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = k.nextInt();
        System.out.println("The factorial of " + x + " is " + fac(x));
    }
}
