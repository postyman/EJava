package chapter3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");
		int count = 0;
		double number = 1, sum = 0, average;
		String notNumber = "";
		
		while (number != 0) {
			System.out.println("Please enter a number you want to include in an average (0 to quit):");
			if (scan.hasNextInt()) {
				number = scan.nextDouble();
				if (number != 0) {
					sum += number;
					count++;
				}
			} else if (scan.hasNextDouble()) {
				number = scan.nextDouble();
				sum += number;
				count++;
			} else {
				notNumber = scan.next();
				scan.nextLine();
				System.out.println("You need to enter a number.");
			}
			System.out.println("The sum so far is: " + sum);
		}
		
		average = (sum / count);
		
		System.out.println("The sum is: " + sum);
		System.out.println("The number of values entered is: " + count);
		System.out.println("The average is: " + fmt.format(average));
		
		scan.close();
		
	}

}
