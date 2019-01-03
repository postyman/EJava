package chapter3;

import java.util.Scanner;

public class HowManyNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int YEAR = 2018;
		int num, sum = 0, count = 0;
		
		do {
			System.out.println("Enter integers one at a time until the sum is greater than the current year:");
			num = scan.nextInt();
			
			sum += num;
			count++;
		} while (sum < YEAR);
		
		System.out.println("It took you " + count + " numbers to reach the year " + YEAR + ".");
		
		scan.close();
	}

}
