package chapter3;

import java.util.Scanner;

public class SumTheNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		do {
			System.out.println("Enter the first number you want to sum (enter 999 to exit the program):");
			num1 = scan.nextInt();
			
			if (num1 != 999) {
				System.out.println("Enter the second number you want to sum:");
				num2 = scan.nextInt();
				
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				System.out.println("");
			}
			
		} while (num1 != 999);
		
		scan.close();
		
	}

}
