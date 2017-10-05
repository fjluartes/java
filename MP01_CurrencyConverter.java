// Fred Luartes, 8/28/2016
// MP1_CurrencyConverter: Make a program that will convert US Dollar, Won, Yen, Dirhams and Pounds to Philippines Peso. The program will loop and will exit if the user wants to. Restriction is a must. 

import java.util.Scanner;

public class MP01_CurrencyConverter {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pesoAmount = 0;
		String convertChoice = "", choice = "";
		do {
			System.out.println("  [A] USD -> PHP");
			System.out.println("  [B] KRW -> PHP");
			System.out.println("  [C] JPY -> PHP");
			System.out.println("  [D] AED -> PHP");
			System.out.println("  [E] GBP -> PHP");
			System.out.println("Enter choice: ");
			convertChoice = keyboard.next();
			switch(convertChoice.toLowerCase()) {
				case "a": pesoAmount = dollarToPeso();
					break;
				case "b": pesoAmount = wonToPeso();
					break;
				case "c": pesoAmount = yenToPeso();
					break;
				case "d": pesoAmount = dirhamToPeso();
					break;
				case "e": pesoAmount = poundToPeso();
					break;
				default: System.out.println("That's not one of the choices!");
					break;
			}
			System.out.println("Your money is Php " + pesoAmount + ".");	
			System.out.print("\nDo you enter again? [Y/N]: ");
			choice = keyboard.next();
		} while (choice.equals("Y") || choice.equals("y"));
	}
	public static int dollarToPeso() {
		int dollar;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("USD -> PHP");
		System.out.println("Enter Dollar amount: ");
		dollar = keyboard.nextInt();
		return dollar * 46;
	}
	public static int wonToPeso() {
		int won;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("KRW -> PHP");
		System.out.println("Enter Won amount: ");
		won = keyboard.nextInt();
		return won / 24;
	}
	public static int yenToPeso() {
		int yen;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("JPY -> PHP");
		System.out.println("Enter Yen amount: ");
		yen = keyboard.nextInt();
		return yen / 2;
	}
	public static int dirhamToPeso() {
		int dirham;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("AED -> PHP");
		System.out.println("Enter Dirham amount: ");
		dirham = keyboard.nextInt();
		return dirham * 13;
	}
	public static int poundToPeso() {
		int pound;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("GBP -> PHP");
		System.out.println("Enter Pound amount: ");
		pound = keyboard.nextInt();
		return pound * 61;
	}
}