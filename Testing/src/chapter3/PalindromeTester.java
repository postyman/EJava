package chapter3;

import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str, another = "y";
		int left, right;
		
		while (another.equalsIgnoreCase("y")) {
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine();
			
			left = 0;
			right = str.length() - 1;
			
			while (str.charAt(left) == str.charAt(right) && left < right) {
				left++;
				right--;
			}
			
			System.out.println("");
			
			if (left < right) {
				System.out.println("That string is NOT a palindrome.");
			} else {
				System.out.println("That string IS a palindrome.");
			}
			
			System.out.println("");
			System.out.println("Test another palindrome (y/n)?");
			another = scan.nextLine();
			
		}
		
		scan.close();

	}

}
