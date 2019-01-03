package chapter3;

import java.util.Scanner;

public class MostDivisors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int upperInt, result = 1, divisors = 0, maxDivisors = 0;
		
		System.out.println("Input a positive integer and the number of integer divisors will be returned:");
		upperInt = scan.nextInt();
		
		for (int j = 2; j <= upperInt; j++) {
			divisors = 0;
			for (int i = 2; i < j; i++) {
				if ((j % i) == 0) {
					divisors++;
				}
			}
			if (maxDivisors < divisors) {
				maxDivisors = divisors;
				result = j;
			}
		}
		
		System.out.println("The integer " + result + " had the most divisors: " + (maxDivisors + 2));
		
		scan.close();
	}

}
