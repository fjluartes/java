// Fred Luartes, 8/20/2016
// Mini Calculator: This calculator program checks if the inputs are valid, computes MDAS operations, and displays the answer.

import java.util.Scanner;

class Test {
    static boolean numberOrNot(String input) {
    	if (input.contains(".")) {
    		try {
        	    Float.parseFloat(input);
        	}
        	catch(NumberFormatException ex) {
        	    return false;
        	}
        	return true;
    	}
    	else {
    		try {
        	    Integer.parseInt(input);
        	}
        	catch(NumberFormatException ex) {
        	    return false;
        	}
        	return true;
    	} 
    }
}

public class MiniCalculator_M6 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int operation; 
		float number1, number2, answer = 0;
		String input1, input2;

		System.out.println("Enter first number: ");
		input1 = keyboard.next();
		System.out.println("Enter second number: ");
		input2 = keyboard.next();

		if (Test.numberOrNot(input1) && Test.numberOrNot(input2)) {
			System.out.println("Select the math operation you want to perform: ");
			System.out.println("	[1] Addition");
			System.out.println("	[2] Subtraction");
			System.out.println("	[3] Multiplication");
			System.out.println("	[4] Division");
			operation = keyboard.nextInt();
	
			number1 = Float.parseFloat(input1);
			number2 = Float.parseFloat(input2);
	
			switch (operation) {
				case 1: answer = AddFunc(number1, number2);
					break;
				case 2:	answer = SubtractFunc(number1, number2);
					break;
				case 3:	answer = MultiplyFunc(number1, number2);
					break;
				case 4: answer = DivideFunc(number1, number2);
					break;
				default: System.out.println("That's not one of the choices!");
					break;
			}
			System.out.println("The answer is " + answer);
		}
		else {
			System.out.println("Invalid input!");
		}
	}

	public static float AddFunc(float num1, float num2) {
		return num1 + num2;
	}

	public static float SubtractFunc(float num1, float num2) {
		return num1 - num2;
	}

	public static float MultiplyFunc(float num1, float num2) {
		return num1 * num2;
	}

	public static float DivideFunc(float num1, float num2) {
		return num1 / num2;
	}
}