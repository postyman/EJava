package chapter4;

import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String wordOne, wordTwo, wordThree, password = "";
		Random rand = new Random();
		int randChar;
		
		System.out.println("Please enter the first word you want to use in creating your password:");
		wordOne = scan.nextLine();
		System.out.println();
		
		System.out.println("Please enter the second word you want to use in creating your password:");
		wordTwo = scan.nextLine();
		System.out.println();
		
		System.out.println("Please enter the third word you want to use in creating your password:");
		wordThree = scan.nextLine();
		System.out.println();
		
		password += wordOne.charAt(0);
		
		password += wordTwo.charAt((wordTwo.length() - 1));
		
		randChar = rand.nextInt(wordThree.length());
		password += wordThree.charAt(randChar);
		
		password += rand.nextInt(10);
		password += rand.nextInt(10);
		password += rand.nextInt(10);
		
		System.out.println("Your new password is: " + password);
		
		scan.close();
	}

}
