package chapter3;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int upperInt, divisorSum = 0;
		String strPerfectNumbers = "";
		
		System.out.println("Input a positive integer and the Perfect Numbers between 1 and it will be returned:");
		upperInt = scan.nextInt();
		
		for (int j = 2; j <= upperInt; j++) {
			divisorSum = 0;
			for (int i = 1; i < j; i++) {
				if ((j % i) == 0) {
					divisorSum += i;
				}
			}
			if (divisorSum == j) {
				strPerfectNumbers = strPerfectNumbers + j + ", ";
			}
		}
		
		System.out.println("The Perfect Numbers between 1 and " + upperInt + " are: ");
		System.out.println(strPerfectNumbers);
		
		scan.close();
	}

}
