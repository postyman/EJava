package chapter3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Allowance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days;
		double today = 0.01, sum = 0.0;
		
		System.out.println("Input the number of days Bob has been receiving his allowance:");
		days = scan.nextInt();
		
		for (int i = 1; i <= days; i++) {
			if (i > 1) {
				today *= 2;
			}
			sum += today;
		}
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		System.out.println("On day " + days + " you earned: " + fmt.format(today));
		System.out.println("The total you've earned in " + days + " days is: " + fmt.format(sum));
		
		scan.close();
	}

}
