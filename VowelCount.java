// VowelCount: Program that counts the number of vowels in a string
public class VowelCount {
    public static void main(String[] args) {
        Counter cnt = new Counter();
        String test = "The quIick brOwn fox jumps ovEr the lAzy dog";
        System.out.println("String = " + test);
        cnt.vowelCount(test);
    }
}

class Counter {
    public void vowelCount(String s) {
        int j = 0, k = 0, l = 0, m = 0, n = 0;
        int total = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == 'a' || c[i] == 'A') {
                j++;
            } else if (c[i] == 'e' || c[i] == 'E') {
                k++;
            } else if (c[i] == 'i' || c[i] == 'I') {
                l++;
            } else if (c[i] == 'o' || c[i] == 'O') {
                m++;
            } else if (c[i] == 'u' || c[i] == 'U') {
                n++;
            }
            total = j + k + l + m + n;
        }
        System.out.println("vowel count: " + total);
        System.out.println("num of a: " + j);
        System.out.println("num of e: " + k);
        System.out.println("num of i: " + l);
        System.out.println("num of o: " + m);
        System.out.println("num of u: " + n);
    }
}

 

