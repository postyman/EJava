package chapter2;

import java.util.Scanner;

public class HMSFromSec {

	public static void main(String[] args) {
		int hours, min, sec, totsec;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many total seconds?");
		totsec = scan.nextInt();
		System.out.println("");
		
		hours = totsec / 3600;
		min = (totsec % 3600) / 60;
		sec = ((totsec % 3600) % 60);
		
		System.out.println("");
		System.out.println("H: " + hours);
		System.out.println("M: " + min);
		System.out.println("S: " + sec);
		
		scan.close();

	}

}
