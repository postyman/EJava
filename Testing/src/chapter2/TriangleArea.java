package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, s, area;
		
		System.out.println("Calculating the area of a triangle.");
		System.out.println("");

		System.out.println("What is the length of side 1?");
		a = scan.nextDouble();

		System.out.println("What is the length of side 2?");
		b = scan.nextDouble();

		System.out.println("What is the length of side 3?");
		c = scan.nextDouble();

		s = (a + b + c)/2.0;
		
		area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		
		DecimalFormat fmtArea = new DecimalFormat ("0.###");
		
		System.out.println("");
		System.out.println("The area of the triangle is: " + fmtArea.format(area));
		
		scan.close();

	}

}
