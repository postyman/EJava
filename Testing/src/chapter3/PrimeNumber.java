package chapter3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int upperInt, largestDivisor = 1;
		
		System.out.println("Input a positive integer and you will be told if it is a prime number:");
		upperInt = scan.nextInt();
		
		for (int i = (upperInt -1); i > 0; i--) {
			if ((upperInt % i) == 0) {
				largestDivisor = i;
				break;
			}
		}
		
		if (largestDivisor == 1) {
			System.out.println("The integer " + upperInt + " IS a prime number.");
		} else {
			System.out.println("The integer " + upperInt + " is NOT a prime number.");
		}
		
		scan.close();
	}

}
