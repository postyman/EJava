package chapter2;

import java.util.Scanner;

public class Quadratic {
	public static void main (String[] args) {
		double a, b, c, root1, root2;
		Scanner values = new Scanner (System.in);
		
		System.out.println("Please list the three coefficients for your quadratic equation (a, b , c):");
		
		a = values.nextDouble();
		b = values.nextDouble();
		c = values.nextDouble();
		
		root1 = ((-1*b) + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		root2 = ((-1*b) - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		
		System.out.println(a + " : " + b + " : " + c);
		System.out.println("Root1 = " + root1);
		System.out.println("Root2 = " + root2);
		
		values.close();
		
	}
}
