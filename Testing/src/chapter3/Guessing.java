package chapter3;

import java.util.Scanner;
import java.util.Random;

public class Guessing {

	public static void main(String[] args) {
		final int MAX = 10;
		int answer, guess;
		Scanner scan = new Scanner(System.in);
		
		Random generator = new Random();
		answer = generator.nextInt(MAX) + 1;
		
		System.out.println("I am thinking of a number between 1 and " + MAX + " inclusive. What is your guess?");
		guess = scan.nextInt();
		
		if (guess == answer) {
			System.out.println("Awesome! You got it!");
		} else {
			System.out.println("Sorry. That's wrong.");
			System.out.println("The answer was: " + answer);
		}
		
		scan.close();

	}

}
