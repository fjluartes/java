// PC11: Count the letters in a string
import java.util.Scanner;

public class PC11_CountLetters {
    public static void letterCount(String s) {
        String lower = s.toLowerCase();
        char[] c = lower.toCharArray();
        int[] count = new int[26];
        int i, j, cToInt = 0, l = 97;
        for (i = 0; i < c.length; i++) {
            cToInt = (int) c[i];
            for (j = 0; j < 26; j++) {
                if (cToInt == l + j) {
                    count[j]++;
                }
            }
        }
        for (j = 0; j < 26; j++) {
            System.out.println((char) (l + j) + " = " + count[j]);
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = k.nextLine();
        letterCount(str);
    }
}
