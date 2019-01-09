package chapter6;

import java.util.Scanner;

public class Tests2 {

	public static void main(String[] args) {
		Scanner scanSt = new Scanner(System.in);
		Scanner scanSc = new Scanner(System.in);
		Scanner scanT = new Scanner(System.in);
		int students, tests;
		double score, sum=0, totalSum=0;
		
		System.out.println("How many students are in the class?");
		students = scanSt.nextInt();
		System.out.println();
		
		System.out.println("How many tests were taken?");
		tests = scanT.nextInt();
		System.out.println();
		
		System.out.println("Please enter the score for each test for each student.");
		
		double[][] testResults = new double[students][tests];
		
		//fill the array with the test scores
		for (int s=0; s<students; s++) {
			for (int t=0; t<tests; t++) {
				System.out.print("Student " + (s+1) + ", Test " + (t+1) + ": ");
				score = scanSc.nextDouble();
				System.out.println();
				testResults[s][t] = score;
			}
		}
		
		//print the results by student
		System.out.println("Student's Test Averages");
		for (int s=0; s<students; s++) {
			System.out.print("Student " + (s+1) + ": ");
			for (int t=0; t<tests; t++) {
				sum += testResults[s][t];
			}
			System.out.println(sum/tests);
			sum = 0;
		}

		System.out.println();
		
		//print the results by test
		System.out.println("Averages by Test");
		for (int t=0; t<tests; t++) {
			System.out.print("Test " + (t+1) + ": ");
			for (int s=0; s<students; s++) {
				sum += testResults[s][t];
				totalSum += testResults[s][t]; //get the total sum while going through the loop
			}
			System.out.println(sum/students);
			sum = 0;
		}
		
		System.out.println();
		System.out.print("Average for all tests taken: " + (totalSum/(students*tests)));
		
		scanSt.close();
		scanSc.close();
		scanT.close();

	}

}
