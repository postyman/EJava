package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MPG {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double odStart, odEnd, gas, mpg;
		
		System.out.println("Please enter starting odometer reading:");
		odStart = scan.nextDouble();
		
		System.out.println("Please enter ending odometer reading:");
		odEnd = scan.nextDouble();
		
		System.out.println("Please enter the number of gallons used:");
		gas = scan.nextDouble();
		
		mpg = (odEnd - odStart) / gas;
		
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		System.out.println("");
		
		System.out.println("MPG");
		System.out.println(fmt.format(mpg));
		
		scan.close();

	}

}
