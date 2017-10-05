// Palindrome: check if a string is a palindrome
public class Palindrome {
    public static void main(String[] args) {
        String test = "nurses run";
        String reversedString = reverse(test);

        System.out.println("string = " + test);
        System.out.println("reverse = " + reversedString);
        if (reversedString.equals(test)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome");
        }
    }

    public static String reverse(String s) {
        int i, l = s.length();
        int last = l - 1;
        char[] chars = s.toCharArray();
        for (i = 0; i < l/2; i++) {
            char c = chars[i];
            chars[i] = chars[last - i];
            chars[last - i] = c;
        }
        return new String(chars);
    }
}
