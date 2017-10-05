// PC08: Palindrome
import java.util.Scanner;

public class PC08_Palindrome {
    public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int l = c.length;
        int last = l - 1;
        String reverse = "";
        boolean isPal = false;
        for (int i = 0; i < l/2; i++) {
            char temp = c[i];
            c[i] = c[last - i];
            c[last - i] = temp;
        }
        reverse = new String(c);
        if (s.equals(reverse)) {
            isPal = true;
        }
        return isPal;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = k.nextLine();
        System.out.println("Is " + str + " a palindrome?");
        System.out.println(isPalindrome(str));
    }
}
