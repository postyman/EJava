package chapter3;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputInt, upperInt, prevInt = 0, count = 1;
		String strMultiply = "";
		String strFactorization = "";
		
		System.out.println("Input a positive integer and the prime factorization will be returned:");
		inputInt = scan.nextInt();
		upperInt = inputInt;
		
		for (int i = 2; i <= upperInt; i++) {
			if ((upperInt % i) == 0) {
				if (strMultiply == "") {
					strMultiply = String.valueOf(i);
				} else {
					strMultiply = strMultiply + " * " + i;
				}
				
				if (prevInt == i) { //same divisor found for new upperInt
					count++;
				} else { //new divisor found
					//close out the previous divisor string and start the new
					if (strFactorization == "") { //beginning of string
						strFactorization = String.valueOf(i);
					} else {
						strFactorization = strFactorization + "^" + count + " * " + i;
					}
					prevInt = i;
					count = 1; //reset count for new divisor
				}
				
				upperInt = upperInt / i; //gets the new upperInt by dividing by the integer that just gave no remainder
				i = 1; //resets the initialization integer to one to start looking for divisors of the new upperInt
			}
			
		}
		
		//add the final count
		strFactorization = strFactorization + "^" + count;
		
		System.out.println();
		System.out.println("The prime factorization for the integer " + inputInt + " is: ");
		System.out.println(strMultiply + "   OR   " + strFactorization);
		
		scan.close();
	}

}
