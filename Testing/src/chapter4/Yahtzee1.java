package chapter4;

import java.util.Random;

public class Yahtzee1 {

	public static void main(String[] args) {
		Random generator = new Random();
		int roll1, roll2, roll3, roll4, roll5, count = 0;
		boolean gotit = false;
		
		while (!gotit) {
			count++;
			roll1 = generator.nextInt(6) + 1;
			roll2 = generator.nextInt(6) + 1;
			if (roll1 == roll2) {
				roll3 = generator.nextInt(6) + 1;
				if (roll3 == roll1) {
					roll4 = generator.nextInt(6) + 1;
					if (roll4 == roll1) {
						roll5 = generator.nextInt(6) + 1;
						if (roll5 == roll1) {
							gotit = true;
						}
					}
				}
			}
		}
		
		System.out.println("It took " + count + " rolls of the dice to get Yahtzee!");
	
	}

}
