package chapter6;

import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanName = new Scanner(System.in);
		int num;
		int longest = 0;
		int shortest = 0;
		
		System.out.println("How many people do you know?");
		num = scan.nextInt();
		
		String[] names = new String[num];
		
		System.out.println("You will now enter the name of each person.");
		
		for (int i=0; i<num; i++) {
			System.out.print("Name " + (i+1) + ": ");
			names[i] = scanName.nextLine();
			
			if (names[i].length() > names[longest].length()) {
				longest = i;
			}

			if (names[i].length() < names[shortest].length()) {
				shortest = i;
			}
		}
		
		System.out.println();
		System.out.println("You know the following " + num + " people:");
		System.out.println();
		
		for (int i=0; i<num; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		System.out.println("The longest name is: " + names[longest]);
		System.out.println("The shortest name is: " + names[shortest]);
		System.out.println();
		System.out.println("This is a range from " + names[shortest].length() + " to " + names[longest].length() + " characters.");
		
		scan.close();
		scanName.close();
	}

}
