package chapter3;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int PERLINE = 10;
		int value, limit, mult, count = 0;
		
		System.out.println("Enter a positive value: ");
		value = scan.nextInt();

		System.out.println("Enter an upper limit: ");
		limit = scan.nextInt();

		System.out.println("");
		System.out.println("The multiples of " + value + " between " + value + " and " + limit + " (inclusive) are:");
		
		for (mult = value; mult <= limit; mult += value) {
			System.out.print(mult + "\t");
			
			//Print a specific number of values per line of output
			count++;
			if (count % PERLINE == 0) {
				System.out.println("");
			}
		}
		
		scan.close();

	}

}
