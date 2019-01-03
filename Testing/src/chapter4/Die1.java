package chapter4;

import java.util.Random;
import java.util.Scanner;

public class Die1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		int roll;
		
		System.out.println("How many sides does your die have?");
		int dieSides = scan.nextInt();
		System.out.println("How many times do you want to roll it?");
		int dieRolls = scan.nextInt();
		System.out.println();
		
		for (int i=1; i <= dieRolls; i++) {
			roll = generator.nextInt(dieSides) + 1;
			System.out.println("Roll " + i + ": " + roll);
		}
		
		
		scan.close();
	}

}
