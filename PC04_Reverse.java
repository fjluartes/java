// PC04: Reverse a string
import java.util.Scanner;

public class PC04_Reverse {
    public static String reverse(String s) {
        char[] c = s.toCharArray();
        int l = c.length;
        int last = l - 1;
        for (int i = 0; i < l/2; i++) {
            char temp = c[i];
            c[i] = c[last - i];
            c[last - i] = temp;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String str = "";
        System.out.println("Enter string: ");
        str = k.nextLine();
        System.out.println(reverse(str));
    }
}
