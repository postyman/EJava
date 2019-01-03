package chapter2;

import java.util.Scanner;

public class SecFromHMS {

	public static void main(String[] args) {
		int hours, min, sec, totsec;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many hours?");
		hours = scan.nextInt();
		System.out.println("");
		
		System.out.println("How many minutes?");
		min = scan.nextInt();
		System.out.println("");
		
		System.out.println("How many seconds?");
		sec = scan.nextInt();
		System.out.println("");
		
		totsec = (hours*3600) + (min*60) + sec;
		
		System.out.println("");
		System.out.println("Total seconds: " + totsec);
		
		scan.close();
	}

}
