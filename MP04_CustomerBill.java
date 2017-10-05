// Fred Luartes, 8/29/2016
// MP4_CustomerBill: Write a program to prints out a customer bill for Ajax Auto Repair. The parts and labor charges are inputs and a 6 percent sales tax is charged on parts but not on labor. Your program should display the following information. 

import java.util.Scanner;
import java.text.DecimalFormat;

public class MP04_CustomerBill {
	public static void main(String[] args) {
		double parts, labor, salesTax, total;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#.00");

		System.out.println("Enter PARTS: ");
		parts = keyboard.nextDouble();
		System.out.println("Enter LABOR: ");
		labor = keyboard.nextDouble();
		salesTax = parts * 0.06;
		total = parts + labor + salesTax;

		System.out.println("	AJAX AUTO REPAIR");
		System.out.println("	SERVICE INVOICE");
		System.out.println("PARTS 			$" + f.format(parts));
		System.out.println("LABOR 			$" + f.format(labor));
		System.out.println("SALES TAX 		$" + f.format(salesTax));
		System.out.println("TOTAL 			$" + f.format(total));
	}
}