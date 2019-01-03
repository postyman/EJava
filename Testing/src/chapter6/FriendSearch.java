package chapter6;

import java.util.Scanner;

public class FriendSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanName = new Scanner(System.in);
		Scanner scanAge = new Scanner(System.in);
		Scanner scanSearch = new Scanner(System.in);
		Scanner scanFirst = new Scanner(System.in);
		Scanner scanLast = new Scanner(System.in);
		Scanner scanAgeS = new Scanner(System.in);
		int num;
		String name, first, last;
		int age, ageS, count;
		int search = 1;
		
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
		}
		
		
		while(search > 0 && search < 4) {
			System.out.println("How would you like to search your friends (1-First, 2-Last, 3-Age, 4-Quit)?");
			search = scanSearch.nextInt();
			
			if (search == 1) {
				System.out.print("First Name to search on? ");
				first = scanFirst.nextLine();
				System.out.println();
				count = 0;
				
				for (int i=0; i<num; i++) {
					if ((first.compareToIgnoreCase(myFriends[i].getFirstName())) == 0) {
						System.out.println("Name: " + myFriends[i].getName());
						System.out.println("Age: " + myFriends[i].getAge());
						System.out.println();
						count++;
					}
				}
				
				if (count == 0) {
					System.out.print("No matches were found.");
					System.out.println();
					System.out.println();
				}
				
			} else if (search == 2) {
				System.out.print("Last Name to search on? ");
				last = scanLast.nextLine();
				System.out.println();
				count = 0;
				
				for (int i=0; i<num; i++) {
					if ((last.compareToIgnoreCase(myFriends[i].getLastName())) == 0) {
						System.out.println("Name: " + myFriends[i].getName());
						System.out.println("Age: " + myFriends[i].getAge());
						System.out.println();
						count++;
					}
				}
				
				if (count == 0) {
					System.out.print("No matches were found.");
					System.out.println();
					System.out.println();
				}
				
			} else if (search == 3) {
				System.out.print("Age to search on? ");
				ageS = scanLast.nextInt();
				System.out.println();
				count = 0;
				
				for (int i=0; i<num; i++) {
					if (ageS == myFriends[i].getAge()) {
						System.out.println("Name: " + myFriends[i].getName());
						System.out.println("Age: " + myFriends[i].getAge());
						System.out.println();
						count++;
					}
				}
				
				if (count == 0) {
					System.out.print("No matches were found.");
					System.out.println();
					System.out.println();
				}
				
			}
		}
		
		scan.close();
		scanName.close();
		scanAge.close();
		scanSearch.close();
		scanFirst.close();
		scanLast.close();
		scanAgeS.close();
	}

}
