// Fred Luartes, 8/15/2016
// Isoceles Triangle: This program uses a for loop to create an isoceles triangle using asterisks. 

public class IsocelesTriangle_M4 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i += 2) {
			for(int k = 0; k < (4 - i / 2); k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}