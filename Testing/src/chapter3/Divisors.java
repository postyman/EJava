package chapter3;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int upperInt, divisors = 2; //setting this to 2 because the number itself and the number one are always divisors
		String strDivisors = "1, ";
		
		System.out.println("Input a positive integer and the number of integer divisors will be returned:");
		upperInt = scan.nextInt();
		
		for (int i = 2; i < upperInt; i++) {
			if ((upperInt % i) == 0) {
				divisors++;
				strDivisors = strDivisors + i + ", ";
			}
		}
		
		strDivisors = strDivisors + upperInt;
		System.out.println("The number of integer divisors for the integer " + upperInt + " is: " + divisors);
		System.out.println(strDivisors);
		
		scan.close();
	}

}
