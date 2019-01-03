package chapter3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Weight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		double weight;
		int planet;
		String response;
		
		System.out.println("Enter your weight on Earth:");

		if (scan.hasNextInt()) {
			weight = scan.nextDouble();
		} else if (scan.hasNextDouble()) {
			weight = scan.nextDouble();
		} else {
			weight = 0;
			scan.nextLine(); //if the input was not a number, this advances to the next scan item so this value is not passed to next next scan check
		}
		
		if (weight<0) {
			weight = 0;
		}
		
		
		System.out.println("");
		
		if (weight!=0) {
			System.out.println("To get your weight on another planet, enter the number associated with that planet:");
			System.out.println("(1)-Mercury, (2)-Venus, (3)-Mars, (4)-Jupiter, (5)-Saturn");
			
			if (scan.hasNextInt()) {
				planet = scan.nextInt();
			} else {
				planet = 0;
			}
	
			System.out.println("");
			
			switch (planet) {
				case 1: response = "Your weight on Mercury: " + fmt.format(weight * 0.37);
						break;
				case 2: response = "Your weight on Venus: " + fmt.format(weight * 0.88);
						break;
				case 3: response = "Your weight on Mars: " + fmt.format(weight * 0.38);
						break;
				case 4: response = "Your weight on Jupiter: " + fmt.format(weight * 2.64);
						break;
				case 5: response = "Your weight on Saturn: " + fmt.format(weight * 1.15);
						break;
				default: response = "You did not enter a valid response, so your weight on Earth is: " + fmt.format(weight);
						break;
			}

			System.out.println(response);
		} else {
			System.out.println("Sorry, you did not enter a valid weight.");
		}
		
		
		scan.close();
		
	}

}
