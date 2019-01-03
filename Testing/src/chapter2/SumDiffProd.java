package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SumDiffProd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num1, num2, sum, diff, prod;
		
		System.out.println("Please enter your first number:");
		num1 = scan.nextDouble();
		
		System.out.println("Please enter your second number:");
		num2 = scan.nextDouble();
		
		sum = num1 + num2;
		diff = num1 - num2;
		prod = num1 * num2;
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("");
		
		System.out.println("SUM");
		System.out.println(num1 + " + " + num2 + " = " + fmt.format(sum));
		System.out.println("");

		System.out.println("DIFFERENCE");
		System.out.println(num1 + " - " + num2 + " = " + fmt.format(diff));
		System.out.println("");
		
		System.out.println("PRODUCT");
		System.out.println(num1 + " * " + num2 + " = " + fmt.format(prod));
		System.out.println("");
		
		scan.close();
		
	}

}
