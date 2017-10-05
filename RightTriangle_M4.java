// Fred Luartes, 8/15/2016
// Right Triangle: This program uses a for loop to create a right triangle using asterisks. 

public class RightTriangle_M4 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i += 2) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}