// Swap numbers without using a temp variable
public class SwapNumbers {
    public static void main(String[] args) {
        double a = 2.45;
        double b = 1.20;
        System.out.println("a = " + a + ", b = " + b);
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("a = " + a + ", b = " + b);;
    }
}
