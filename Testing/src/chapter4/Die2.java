package chapter4;

import java.util.Random;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Die2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		DecimalFormat fmtOne = new DecimalFormat("0.#");
		int roll;
		double one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
		
		System.out.println("How many times do you want to roll a 6-sided die?");
		int dieRolls = scan.nextInt();
		System.out.println();
		
		if (dieRolls <= 0) {
			System.out.println("Game Over");
		} else {
			for (int i=1; i <= dieRolls; i++) {
				roll = generator.nextInt(6) + 1;
				
				switch (roll) {
					case 1: one++;
							break;
					case 2: two++;
							break;
					case 3: three++;
							break;
					case 4: four++;
							break;
					case 5: five++;
							break;
					case 6: six++;
							break;
				}
			}
			
			System.out.println("The number 1 was rolled " + one + " times or " + fmtOne.format(one/dieRolls*100) + "% of total rolls");
			System.out.println("The number 2 was rolled " + two + " times or " + fmtOne.format(two/dieRolls*100) + "% of total rolls");
			System.out.println("The number 3 was rolled " + three + " times or " + fmtOne.format(three/dieRolls*100) + "% of total rolls");
			System.out.println("The number 4 was rolled " + four + " times or " + fmtOne.format(four/dieRolls*100) + "% of total rolls");
			System.out.println("The number 5 was rolled " + five + " times or " + fmtOne.format(five/dieRolls*100) + "% of total rolls");
			System.out.println("The number 6 was rolled " + six + " times or " + fmtOne.format(six/dieRolls*100) + "% of total rolls");
		}
		
		scan.close();
	}

}
