// Arrays in java and insertion sort
public class InsertionSort {
	public static void main(String[] args) {
		int i, j, l, key = 0;
		int[] num = {5, 2, 4, 1, 6, 3};
		for (j = 1; j < 6; j++) {
			key = num[j];
			i = j - 1;
			while (i >= 0 && num[i] > key) {
				num[i + 1] = num[i];
				i = i - 1;
				num[i + 1] = key;
			}
		}
		for (l = 0; l < 6; l++){
			System.out.println(num[l]);
		}
	}
}
