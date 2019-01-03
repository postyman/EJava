package chapter6;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		int num;
		int[] nums = new int[10000];
		boolean again = true;
		int response;
		int count = 0;
		
		for (int i=0; i<10000; i++) {
			num = generator.nextInt(100) + 1;
			nums[i] = num;
		}
		
		System.out.println("An array of 10,000 is filled with integers from 1 to 100.");
		
		while (again) {
			System.out.println("Which integer do you want to see the number of times it appears (less than 1 or greater than 100 to quit)?");
			response = scan.nextInt();
			
			if (response > 0 && response < 101) {
				for (int i=0; i<10000; i++) {
					if (nums[i] == response) {
						count++;
					}
				}
				
				System.out.println(response + " appears " + count + " times.");
				System.out.println();
				count = 0;
			} else {
				again = false;
			}
			
		}
		
		scan.close();

	}

}
