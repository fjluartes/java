// PC09: Repeat a string
public class PC09_RepeatString {
    public static void repeatString(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String word = "Woof";
        int num = 8;
        repeatString(word, num);
    }
}
