package chapter4;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		int guess1, guess2, guess3, guess4, count = 0;
		int num1, num2, num3, num4;
		int low, high;
		boolean gotit = false;
		
		System.out.println("The computer will try to guess the lottery numbers for your 4-number lottery.");
		System.out.println("Enter the low number of the range of numbers:");
		low = scan.nextInt();
		System.out.println("Enter the high number of the range of numbers:");
		high = scan.nextInt();
		
		System.out.println();
		
		System.out.println("Enter the first number in your lottery:");
		num1 = scan.nextInt();
		System.out.println("Enter the second number in your lottery:");
		num2 = scan.nextInt();
		System.out.println("Enter the third number in your lottery:");
		num3 = scan.nextInt();
		System.out.println("Enter the fourth number in your lottery:");
		num4 = scan.nextInt();
		
		while (!gotit) {
			count++;
			guess1 = generator.nextInt(high - low + 1) + low;
			if (guess1 == num1) {
				guess2 = generator.nextInt(high - low + 1) + low;
				if (guess2 == num2) {
					guess3 = generator.nextInt(high - low + 1) + low;
					if (guess3 == num3) {
						guess4 = generator.nextInt(high - low + 1) + low;
						if (guess4 == num4) {
							gotit = true;
						}
					}
				}
			}
		}
		
		System.out.println("It took " + count + " tries for the computer to guess the lottery number!");
		
		scan.close();
	}

}
