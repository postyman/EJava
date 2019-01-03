package chapter2;

import java.util.Scanner;

public class Echo {
	public static void main (String[] args) {
		Scanner response = new Scanner(System.in);
		String message;
		
		System.out.println("What is your favorite movie?");
		
		message = response.nextLine();
		
		System.out.println("Your favorite movie is " + message.toUpperCase() + "?");
		
		response.close();
	}
	
}
