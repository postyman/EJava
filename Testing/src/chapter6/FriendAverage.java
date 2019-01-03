package chapter6;

import java.util.Scanner;

public class FriendAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanName = new Scanner(System.in);
		Scanner scanAge = new Scanner(System.in);
		int num;
		String name;
		int age;
		int length = 0;
		
		System.out.println("How many friends do you have?");
		num = scan.nextInt();
		Friend[] myFriends = new Friend[num];
		System.out.println();
		System.out.println("You will now enter your friends' names and ages.");
		System.out.println();
		
		for (int i=0; i<num; i++) {
			System.out.print("First and Last Name " + (i+1) + ": ");
			name = scanName.nextLine();
			System.out.print("Age " + (i+1) + ": ");
			age = scanAge.nextInt();
			System.out.println();
			
			myFriends[i] = new Friend(name, age);
			
			length += name.length();
			
		}

		System.out.println();
		System.out.println("The average length of your friends' names is: " + (length/num) + " characters.");
		
		
		scan.close();
		scanName.close();
		scanAge.close();
	}

}
