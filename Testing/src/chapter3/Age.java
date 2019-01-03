package chapter3;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		final int MINOR = 21;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		
		System.out.println("You entered: " + age);
		
		if (age < MINOR)
			System.out.println("Youth is wasted on the young!");
		else
			System.out.println("Man you're old!");
		
		scan.close();

	}

}
