package chapter4;

import java.text.DecimalFormat;

public class RightTriangle2 {
	private double base;
	private double height;
	private double hypot;
	private double hypotDiff = 0;
	private final double HYPOTTOLERANCE = 0.001;
	private DecimalFormat fmtTwo = new DecimalFormat("0.##");
	
	//-----------------------------------------------------------------
	//default constructor
	public RightTriangle2() {
		base = 3.0;
		height = 4.0;
		hypot = 5.0;
	}
	
	
	//-----------------------------------------------------------------
	//alternate constructor
	public RightTriangle2(double b, double h, double hy) {
		base = b;
		height = h;
		hypot = hy;
		
		if (b <= 0 || h <= 0 || hy <= 0) { //side lengths have to be positive numbers
			System.out.println("One of sides of your triangle has a negative length. The calculations will fail.");
			System.out.println();
			toString();
		} else if (hy <= b || hy <= h) { //hypotenuse cannot be shorter than either of the other sides
			System.out.println("The hypotenuse is shorter than one of the sides of your triangle. The calculations will fail.");
			System.out.println();
			toString();
			double hypotCalc = hypotenuse();
			hypotDiff = Math.abs(hypot - hypotCalc);
		} else if (hy >= (b + h)) { //hypotenuse cannot be longer than the sum of the other sides
			System.out.println("The hypotenuse is longer than the sum of the other two sides of your triangle. The calculations will fail.");
			System.out.println();
			toString();
			double hypotCalc = hypotenuse();
			hypotDiff = Math.abs(hypot - hypotCalc);
		} else {
			double hypotCalc = hypotenuse();
			hypotDiff = Math.abs(hypot - hypotCalc);
			
			if (hypotDiff > HYPOTTOLERANCE) {
				System.out.println("The hypotenuse entered is incorrect. The perimeter and area calculations will be wrong.");
				System.out.println();
				toString();
				System.out.println("Calculated Hypotenuse: " + hypotCalc);
				System.out.println();
			}
		}
		
		
	}
	
	
	//-----------------------------------------------------------------
	//get the base of the triangle
	public double getBase() {
		return base;
	}
	
	
	//-----------------------------------------------------------------
	//get the height of the triangle
	public double getHeight() {
		return height;
	}
	
	
	//-----------------------------------------------------------------
	//get the hypotenuse of the triangle
	public double getHypot() {
		return hypot;
	}
	
	
	//-----------------------------------------------------------------
	//set the base of the triangle
	public double setBase(double b) {
		base = b;
		
		return base;
	}
	
	
	//-----------------------------------------------------------------
	//set the height of the triangle
	public double setHeight(double h) {
		height = h;
		
		return height;
	}
	
	
	//-----------------------------------------------------------------
	//set the hypotenuse of the triangle
	public double setHypot(double hy) {
		hypot = hy;
		
		return hypot;
	}
		
	
	//-----------------------------------------------------------------
	//calculate the triangle's hypotenuse using the Math class
	public double hypotenuse() {
		double hyp = 0;
		if (base <= 0 || height <= 0 || hypot <= 0) { //side lengths have to be positive numbers
			System.out.println();
			System.out.println("Cannot calculate the hypotenuse. One of sides of your triangle has a negative length.");
		} else {
			hyp = Math.hypot(base, height);
		}
			
		return hyp;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the triangle's perimeter
	public double perimeter() {
		double per = 0;
		if (base <= 0 || height <= 0 || hypot <= 0) { //side lengths have to be positive numbers
			System.out.println();
			System.out.println("Cannot calculate the perimeter. One of sides of your triangle has a negative length.");
		} else if (hypotDiff > HYPOTTOLERANCE) {
			System.out.println();
			System.out.println("Cannot accurately calculate the perimeter. The hypotenuse entered is out of tolerance for a right triangle.");
			System.out.println("Calculated Hypotenuse: " + hypotenuse());
		} else {
			per = (base + height + hypot);
		}
			
		return per;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the triangle's area
	public double area() {
		double a = 0;
		if (base <= 0 || height <= 0 || hypot <= 0) { //side lengths have to be positive numbers
			System.out.println();
			System.out.println("Cannot calculate the area. One of sides of your triangle has a negative length.");
		} else if (hypotDiff > HYPOTTOLERANCE) {
			System.out.println();
			System.out.println("Cannot accurately calculate the area. The hypotenuse entered is out of tolerance for a right triangle.");
			System.out.println("Calculated Hypotenuse: " + hypotenuse());
		} else {
			a = base * height / 2;
		}
		
		return a;
	}

	
	//-----------------------------------------------------------------
	//default string return
	public String toString() {
		String triInfo = "Triangle Base: " + fmtTwo.format(base) + ";\n" + 
				"Triangle Height: " + fmtTwo.format(height) + ";\n" + 
				"Triangle Hypotenuse: " + fmtTwo.format(hypot) + ";\n";

		return triInfo;
	}
	
}
