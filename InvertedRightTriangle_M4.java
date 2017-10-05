// Fred Luartes, 8/17/2016
// Inverted Right Triangle: This program uses a for loop to create an inverted right triangle using asterisks. 

public class InvertedRightTriangle_M4 {
	public static void main(String[] args) {
		for(int i = 10; i > 1; i -= 2) {
			for(int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}