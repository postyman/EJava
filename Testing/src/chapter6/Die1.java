package chapter6;

import java.util.Random;
import java.util.Scanner;

public class Die1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		int roll;
		int[] rolls = new int[10000];
		boolean again = true;
		int response;
		
		for (int i=0; i<10000; i++) {
			roll = generator.nextInt(6) + 1;
			rolls[i] = roll;
		}
		
		System.out.println("I just rolled a 6-sided die 10,000 times.");
		
		while (again) {
			System.out.println("Which roll number do you want to see (less than 1 or greater than 10,000 to quit)?");
			response = scan.nextInt();
			if (response > 0 && response < 10001) {
				System.out.println("Roll number " + response + " was a " + rolls[response - 1]);
				System.out.println();
			} else {
				again = false;
			}
			
		}
		
		scan.close();
	}

}
