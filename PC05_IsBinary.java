// PC05: Is Binary or Not
import java.util.Scanner;

public class PC05_IsBinary {
    public static boolean checkIfBinary(String s) {
        boolean isBinary = true;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] != '0' && c[i] != '1') {
                isBinary = false;
            }
        }
        return isBinary;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter number: ");
        String input = k.nextLine();
        System.out.println(checkIfBinary(input));
    }
}
