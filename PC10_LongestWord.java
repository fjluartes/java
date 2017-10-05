// PC10: Longest word in a string
import java.util.Scanner;

public class PC10_LongestWord {
    public static void longestWord(String s) {
        char[] c = s.toCharArray();
        int count = 0, maxCount = 0, index = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ' && c[i] != '\0') {
                count++;
            } else {
                count = 0;
            }
            if (maxCount < count) {
                maxCount = count;
                index = i - count + 1;
            }
        }
        for (int j = index; j < index + maxCount; j++) {
            System.out.print(c[j]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = k.nextLine();
        longestWord(str);
    }
}
