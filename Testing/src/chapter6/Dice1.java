package chapter6;

import java.util.Random;
import java.util.Scanner;

public class Dice1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanSt = new Scanner(System.in);
		Scanner scanSi = new Scanner(System.in);
		Scanner scanR = new Scanner(System.in);
		int students, sides, rolls;
		
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
		
		scanSt.close();
		scanSi.close();
		scanR.close();
	}

}
