package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleStats {
	public static void main (String[] args) {
		double radius, area, circumference;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle?");
		radius = scan.nextDouble();
		
		area = Math.PI * Math.pow(radius, 2);
		circumference = 2 * Math.PI * radius;
		
		//This rounds the result to 3 decimal places
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("The area is: " + fmt.format(area));
		System.out.println("The circumference is: " + fmt.format(circumference));
		
		scan.close();
		
	}
}
