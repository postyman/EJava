package chapter3;

import java.util.Scanner;
import java.text.NumberFormat;

public class Wages {

	public static void main(String[] args) {
		final double RATE = 8.25; //normal hourly rate
		final double STANDARD = 40.0; //normal work week
		double pay = 0.0;
		double hours;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of hours you worked this week:");
		hours = scan.nextDouble();
		
		if (hours <= STANDARD) {
			pay = hours * RATE;
		} else {
			pay = (40 * RATE) + ((hours - 40) * RATE * 1.5);
		}
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		System.out.println("You've earned: " + fmt.format(pay));
		
		scan.close();
	}

}
