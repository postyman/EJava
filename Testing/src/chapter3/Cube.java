package chapter3;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int  EXIT = -1;
		int num;
		
		System.out.println("Enter an integer you want cubed (enter -1 to exit program):");
		num = scan.nextInt();
		
		while (num != EXIT) {
			System.out.println(num + " cubed is " + Math.pow(num, 3));
			
			System.out.println("");
			System.out.println("Enter an integer you want cubed (enter -1 to exit program):");
			num = scan.nextInt();
		}
		
		scan.close();
	}

}
