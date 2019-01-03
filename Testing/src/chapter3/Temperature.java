package chapter3;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp;
		
		System.out.println("Let's see what you can do outside today.");
		System.out.println("What is the temperature?");
		
		temp = scan.nextInt();
		
		if (temp > -10) {
			if (temp > 35) {
				if (temp > 74) {
					if (temp > 83) {
						System.out.println("Awesome! Swimming!");
					} else {
						System.out.println("Get your racket, it's Tennis time.");
					}
				} else {
					System.out.println("Great day for Golf.");
				}
			} else {
				System.out.println("Woohoo! Snow Shoeing it is!");
			}
		} else {
			System.out.println("It is way too cold, you better stay inside.");
		}
		
		scan.close();
		
	}
	
}
