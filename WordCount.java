// WordCount: Count the number of words in a string
public class WordCount {
    public static void main(String[] args) {
        Counter cnt = new Counter();
        String test = "The quick brown etaoin shrdru";
        String test2 = "Exception in thread \"main\" java lang Array Index Out Of Bounds Exception:";
        cnt.wordCounter(test);
        cnt.wordCounter(test2);
    }
}

class Counter {
    public void wordCounter(String s) {
        int count = 0;
        boolean word = false;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (c[i] != ' ') {
                word = false;
            } else if ((c[i] == ' ') && (c[i-1] != ' ')) {
                word = true;
                count++;
            } else if (i == (s.length() - 1)) {
                count++;
            }
        }
        System.out.println("word count: " + count);
    }
}
