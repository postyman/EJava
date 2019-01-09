package chapter6;

import java.util.Random;
import java.util.Scanner;

public class Dice1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanSt = new Scanner(System.in);
		Scanner scanSi = new Scanner(System.in);
		Scanner scanR = new Scanner(System.in);
		Scanner scanV = new Scanner(System.in);
		int students, sides, rolls, value, count=0;
		
		System.out.println("How many students are in the class?");
		students = scanSt.nextInt();
		System.out.println();
		
		System.out.println("How many sides are on the die?");
		sides = scanSi.nextInt();
		System.out.println();
		
		System.out.println("How many times should the die be rolled?");
		rolls = scanR.nextInt();
		System.out.println();
		
		int[][] rollResults = new int[students][rolls];
		
		//fill the array with random die rolls
		for (int s=0; s<students; s++) {
			for (int r=0; r<rolls; r++) {
				rollResults[s][r] = (rand.nextInt(sides) + 1);
			}
		}
		
		//print the results by student
		System.out.println("Rolls by Student");
		for (int s=0; s<students; s++) {
			System.out.print("Student " + (s+1) + ": ");
			for (int r=0; r<rolls; r++) {
				System.out.print(rollResults[s][r] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		
		//print the results by roll
		System.out.println("Rolls by Roll Number");
		for (int r=0; r<rolls; r++) {
			System.out.print("Roll " + (r+1) + ": ");
			for (int s=0; s<students; s++) {
				System.out.print(rollResults[s][r] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Show the number of times a value was rolled.");
		System.out.println("Enter a value between 1 and " + sides + " or outside that range to quit.");
		value = scanV.nextInt();
		
		while (value > 0 && value <= sides) {
			for (int s=0; s<students; s++) {
				for (int r=0; r<rolls; r++) {
					if (value == rollResults[s][r]) {
						count++;
					}
				}
			}
			System.out.println("The value " + value + " was rolled " + count + " times.");
			count = 0;
			System.out.println();
			System.out.println("Enter a value between 1 and " + sides + " or outside that range to quit.");
			value = scanV.nextInt();
		}
		
		scanSt.close();
		scanSi.close();
		scanR.close();
		scanV.close();
	}

}
