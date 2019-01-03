package chapter3;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int upperInt;
		BigInteger factorial = BigInteger.valueOf(1);
		
		System.out.println("Input a positive integer and the factorial of that integer will be returned:");
		upperInt = scan.nextInt();
		
		for (int i = upperInt; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("The factorial of the integer " + upperInt + " is: " + factorial);
		
		scan.close();
	}

}
