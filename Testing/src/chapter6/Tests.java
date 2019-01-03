package chapter6;

import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
		final int QUANTITY = 3;
		final double QUANTITYD = QUANTITY;
		Scanner scan = new Scanner(System.in);
		int[] tests = new int[QUANTITY];
		int result;
		int min = 100;
		int max = 0;
		int sum = 0;

		System.out.println("You will be prompted for " + QUANTITY + " test scores, one at a time and then the");
		System.out.println("highest, lowest, average, and all the results will be displayed.");
		System.out.println();
		
		for (int i=0; i<QUANTITY; i++) {
			System.out.print("Please enter test score " + (i+1) + ": ");
			result = scan.nextInt();
			System.out.println();
			tests[i] = result;
			
			sum += result;
			
			if (result > max) {
				max = result;
			}
			
			if (result < min) {
				min = result;
			}
			
		}
		
		System.out.println("Highest test score: " + max);
		System.out.println("Lowest test score: " + min);
		System.out.println("Average test score: " + (sum/QUANTITYD));
		
		System.out.println("All test scores:");
		System.out.print("(");
		for (int i=0; i<QUANTITY; i++) {
			System.out.print(tests[i]);
			if (i<(QUANTITY-1)) {
				System.out.print(", ");
			}
		}
		System.out.print(")");
		
		scan.close();
	}

}
