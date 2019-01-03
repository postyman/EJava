package chapter3;

import java.util.Scanner;

public class CountByFive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int limit, mult = 5;
		
		System.out.println("This program counts by 5 to the limit you enter.");
		System.out.println("Enter that upper limit: ");
		limit = scan.nextInt();

		System.out.println("");
		System.out.println("The multiples of 5 less than or equal to " + limit + " are:");
		
		while (mult <= limit) {
			System.out.print(mult + " ");
			mult += 5;
		}
		
		scan.close();

	}

}
