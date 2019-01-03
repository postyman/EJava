package chapter3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TestScores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.##");
		double test1, test2, test3, testAVG;
		
		System.out.println("Please enter your three test scores:");
		test1 = scan.nextDouble();
		test2 = scan.nextDouble();
		test3 = scan.nextDouble();
		
		testAVG = (test1 + test2 + test3) / 3.0;
		
		if (testAVG >= 69.5) {
			if (testAVG >= 77.5) {
				if (testAVG >= 84.5) {
					if (testAVG >= 92.5) {
						System.out.println("Your test average is: " + fmt.format(testAVG));
						System.out.println("Your current grade is: A");
					} else {
						System.out.println("Your test average is: " + fmt.format(testAVG));
						System.out.println("Your current grade is: B");
					}
				} else {
					System.out.println("Your test average is: " + fmt.format(testAVG));
					System.out.println("Your current grade is: C");
				}
			} else {
				System.out.println("Your test average is: " + fmt.format(testAVG));
				System.out.println("Your current grade is: D");
			}
		} else {
			System.out.println("Your test average is: " + fmt.format(testAVG));
			System.out.println("Your current grade is: F");
		}
		
		scan.close();

	}

}
