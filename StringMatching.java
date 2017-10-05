// StringMatching: Brute force string matching using java
public class StringMatching {
    public static void main(String[] args) {
        String text = "The quick brown fox";
        String pattern = "brow";
        char[] T = text.toCharArray();
        char[] P = pattern.toCharArray();
        int index = 0;

        index = StringMatch(T, P);
        System.out.println("index = " + index);
    }

    public static int StringMatch(char[] T, char[] P) {
        int i = 0, j = 0;
        int n = T.length, m = P.length;

        for (i = 0; i < n - m; i++) {
            while (j < m && P[j] == T[i + j]) {
                j = j + 1;
                if (j == m) {
                    return i;
                }
            }
        }
        return -1;
    }
}
