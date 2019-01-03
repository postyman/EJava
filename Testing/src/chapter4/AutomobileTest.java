package chapter4;

import java.util.Scanner;

public class AutomobileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Automobile momsCar = new Automobile();
		Automobile dadsCar = new Automobile(32, 16, 10000);
		
		System.out.println("How many miles per gallon does your child's car get?");
		double kidMPG = scan.nextDouble();
		System.out.println("How many gallons does your child's car's tank hold?");
		double kidTank = scan.nextDouble();
		System.out.println("How many miles are on your child's car's odometer?");
		double kidOdometer = scan.nextDouble();
		System.out.println();

		Automobile kidsCar = new Automobile(kidMPG, kidTank, kidOdometer);
		
		dadsCar.refuel(6.3, 10200);
		momsCar.refuel(18.7, 320);
		
		System.out.println("Dad's Car\n" + dadsCar);
		System.out.println("Mom's Car\n" + momsCar);
		System.out.println("Kid's Car\n" + kidsCar);
		
		
		scan.close();
	}

}
