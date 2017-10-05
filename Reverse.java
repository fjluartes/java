// Reverse: Display a string in reverse
public class Reverse {
    public static void main(String[] args) {
        String test = "Madam, I'm Adam";
        
        System.out.println(reverse(test));
    }

    public static String reverse(String s) {
        int i;
        int l = s.length();
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
