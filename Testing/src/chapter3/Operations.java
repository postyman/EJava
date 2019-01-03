package chapter3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Operations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		double num1, num2;
		int operation;
		String response;
		
		System.out.println("Enter your first number:");

		if (scan.hasNextInt()) {
			num1 = scan.nextDouble();
		} else if (scan.hasNextDouble()) {
			num1 = scan.nextDouble();
		} else {
			num1 = 0;
			System.out.println("Sorry, that's not a valid number.");
			System.exit(0);
		}

		System.out.println("Enter your second number:");

		if (scan.hasNextInt()) {
			num2 = scan.nextDouble();
		} else if (scan.hasNextDouble()) {
			num2 = scan.nextDouble();
		} else {
			num2 = 0;
			System.out.println("Sorry, that's not a valid number.");
			System.exit(0);
		}
		
		
		System.out.println("");
		
		System.out.println("Select the operation you would like to perform on the two numbers:");
		System.out.println("(1)-Sum, (2)-Difference, (3)-Product, (4)-Quotient, (5)-Square the first number");
		
		if (scan.hasNextInt()) {
			operation = scan.nextInt();
		} else {
			operation = 0;
		}

		System.out.println("");
		
		switch (operation) {
			case 1: response = num1 + " + " + num2 + " = " + fmt.format(num1 + num2);
					break;
			case 2: response = num1 + " - " + num2 + " = " + fmt.format(num1 - num2);
					break;
			case 3: response = num1 + " * " + num2 + " = " + fmt.format(num1 * num2);
					break;
			case 4: if (num2 == 0) {
						response = "Sorry, cannot divide by zero.";
					} else {
						response = num1 + " / " + num2 + " = " + fmt.format(num1 / num2);
					}
					break;
			case 5: response = num1 + " squared = " + fmt.format(Math.pow(num1,2));
					break;
			default: response = "Sorry, you did not enter a valid operation.";
					scan.close();
					System.out.println(response);
					System.exit(0);
		}
		
		System.out.println(response);
		
		scan.close();
		

	}

}
