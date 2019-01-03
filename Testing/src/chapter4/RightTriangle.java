package chapter4;

import java.text.DecimalFormat;

public class RightTriangle {
	private double base;
	private double height;
	private DecimalFormat fmtTwo = new DecimalFormat("0.##");
	
	//-----------------------------------------------------------------
	//default constructor
	public RightTriangle() {
		base = 3.0;
		height = 4.0;
	}
	
	
	//-----------------------------------------------------------------
	//alternate constructor
	public RightTriangle(double b, double h) {
		base = b;
		height = h;
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
	//calculate the triangle's hypotenuse using the Math class
	public double hypot() {
		double hyp = Math.hypot(base, height);
		
		return hyp;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the triangle's perimeter
	public double perimeter() {
		double per = (Math.hypot(base, height) + base + height);
		
		return per;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the triangle's area
	public double area() {
		double a = base * height / 2;
		
		return a;
	}

	
	//-----------------------------------------------------------------
	//default string return
	public String toString() {
		String triInfo = "Triangle Base: " + fmtTwo.format(base) + ";\n" + 
				"Triangle Height: " + fmtTwo.format(height) + ";\n";

		return triInfo;
	}
	
}
