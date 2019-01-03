package chapter3;

import java.util.Scanner;

public class LargestDivisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int upperInt, largestDivisor = 1;
		
		System.out.println("Input a positive integer and the largest divisor (other than itself) will be returned:");
		upperInt = scan.nextInt();
		
		for (int i = (upperInt -1); i > 0; i--) {
			if ((upperInt % i) == 0) {
				largestDivisor = i;
				break;
			}
		}
		
		if (largestDivisor == 1) {
			System.out.println("The largest divisor for the integer " + upperInt + " is itself, it is a prime number.");
		} else {
			System.out.println("The largest divisor for the integer " + upperInt + " is: " + largestDivisor);
		}
		
		scan.close();
	}

}
