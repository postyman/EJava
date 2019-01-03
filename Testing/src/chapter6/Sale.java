package chapter6;

import java.util.Scanner;
import java.text.NumberFormat;

public class Sale {

	public static void main(String[] args) {
		final int QUANTITY = 3;
		Scanner scan = new Scanner(System.in);
		double[] prices = new double[QUANTITY];
		double result;
		double disc;

		System.out.println("You will be prompted for " + QUANTITY + " prices, one at a time and then the crazy sale will take place.");
		System.out.println("Each item will be marked down between 0 and 100%!");
		System.out.println();
		
		for (int i=0; i<QUANTITY; i++) {
			System.out.print("Please enter price " + (i+1) + ": ");
			result = scan.nextDouble();
			System.out.println();
			prices[i] = result;
			
		}
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		NumberFormat fmtP = NumberFormat.getPercentInstance();
		fmtP.setMinimumFractionDigits(1);
		
		System.out.println("Here are your discounts:");
		for (int i=0; i<QUANTITY; i++) {
			disc = Math.random();
			System.out.print(fmt.format(prices[i]) + " * " + fmtP.format((1 - disc)) + " = " + fmt.format(prices[i] * (1 - disc)));
			System.out.println();
		}
		
		scan.close();

	}

}
