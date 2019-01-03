package chapter3;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int upperInt, sum = 0;
		
		System.out.println("Input a positive integer and the odd integers between it and zero will be summed:");
		upperInt = scan.nextInt();
		
		for (int i = (upperInt - 1); i > 0; i--) {
			if ((i % 2) != 0) {
				sum += i;
			}
		}
		
		System.out.println("The sum of the odd integers below the number " + upperInt + " is: " + sum);
		
		scan.close();
	}

}
