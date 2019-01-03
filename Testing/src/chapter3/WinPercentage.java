package chapter3;

import java.util.Scanner;
import java.text.NumberFormat;

public class WinPercentage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getPercentInstance();
		final int NUMGAMES = 12;
		int won;
		double ratio;
		
		System.out.println("Enter the number of games won (0 to " + NUMGAMES + "):");
		won = scan.nextInt();
		
		while (won < 0 || won > NUMGAMES) {
			System.out.println("Invalid input. Please reenter:");
			won = scan.nextInt();
		}
		
		ratio = (double)won / NUMGAMES;
		
		System.out.println("Winning percentage: " + fmt.format(ratio));
		
		scan.close();
		
	}

}
