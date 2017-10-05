// BinarySearchTwo: Binary search on a sorted array using java
public class BinarySearchTwo {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3, index = 0;

        index = BinarySearch(A, k);
        System.out.println("index of key = " + index);
    }

    public static int BinarySearch(int[] A, int key) {
        int l = 0, r = A.length - 1;
        int m = 0;

        while (l <= r) {
            m = (l + r) / 2;
            if (A[m] == key) {
                return m;
            } else if (A[m] > key) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
