// PC13: Nested Arrays
public class PC13_NestedArrays {
    public static void largest(int[][] A) {
        int i, j, k, key = 0;
        for (i = 0; i < A.length; i++) {
            for (j = 1; j < A[i].length; j++) {
                key = A[i][j];
                k = j - 1;
                while (k >= 0 && A[i][k] > key) {
                    A[i][k + 1] = A[i][k];
                    k = k - 1;
                }
                A[i][k + 1] = key;
            }
            System.out.print(A[i][j - 1] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] A = new int[5][];
        A[0] = new int[]{6, 18, 92}; 
        A[1] = new int[]{2, 132, 4}; 
        A[2] = new int[]{5, 4, 3};
        A[3] = new int[]{56, 42, 99, 84, 103};
        A[4] = new int[]{8, 71, 9, 85, 34, 90, 4};
        largest(A);
    }
}
