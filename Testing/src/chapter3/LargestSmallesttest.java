package chapter3;

import java.util.Scanner;

public class LargestSmallesttest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int EXIT = 9999;
		int min = 100, max = 0, score;
		
		System.out.println("Enter test scores (one at a time) to get the min and max scores.");
		System.out.println("Enter your first score:");
		score = scan.nextInt();
		
		while (score != EXIT) {
			if (score < min) {
				min = score;
			}
			
			if (score > max) {
				max = score;
			}
			
			System.out.println("Enter your next score (or 9999 to exit):");
			score = scan.nextInt();
		}
		
		System.out.println("");
		System.out.println("The minimum score was: " + min);
		System.out.println("The maximum score was: " + max);
		scan.close();
	}

}
