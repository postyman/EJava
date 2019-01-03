package chapter4;

import java.text.DecimalFormat;

public class IsosTrapezoid {
	private double base1;
	private double base2;
	private double height;
	private DecimalFormat fmtTwo = new DecimalFormat("0.##");
	
	
	//-----------------------------------------------------------------
	//default constructor
	public IsosTrapezoid() {
		base1 = 5.0;
		base2 = 3.0;
		height = 2.0;
	}
	
	
	//-----------------------------------------------------------------
	//alternate constructor
	public IsosTrapezoid(double b1, double b2, double h) {
		base1 = b1;
		base2 = b2;
		height = h;
	}
	
	
	//-----------------------------------------------------------------
	//get base1 of the trapezoid
	public double getBaseOne() {
		return base1;
	}
	
	
	//-----------------------------------------------------------------
	//get base2 of the trapezoid
	public double getBaseTwo() {
		return base2;
	}
	
	
	//-----------------------------------------------------------------
	//get the height of the trapezoid
	public double getHeight() {
		return height;
	}
	
	
	//-----------------------------------------------------------------
	//set base1 of the trapezoid
	public double setBaseOne(double b1) {
		base1 = b1;
		
		return base1;
	}
	
	
	//-----------------------------------------------------------------
	//set base2 of the trapezoid
	public double setBaseTwo(double b2) {
		base2 = b2;
		
		return base2;
	}
	
	
	//-----------------------------------------------------------------
	//set the height of the trapezoid
	public double setHeight(double h) {
		height = h;
		
		return height;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the length of the non-parallel side of the trapezoid (hypotenuse using the Math class)
	public double leg() {
		double triBase = Math.abs(base1 - base2);
		double legLength = Math.hypot(triBase, height);
		
		return legLength;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the trapezoid's perimeter
	public double perimeter() {
		double per = (base1 + base2 + (2 * leg()));
		
		return per;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the trapezoid's area
	public double area() {
		double a = (base1 + base2) / 2 * height;
		
		return a;
	}
	
	
	//-----------------------------------------------------------------
	//default string return
	public String toString() {
		String trapInfo = "Trapezoid Base1: " + fmtTwo.format(base1) + ";\n" + 
				"Trapezoid Base2: " + fmtTwo.format(base2) + ";\n" + 
				"Trapezoid Height: " + fmtTwo.format(height) + ";\n";
	
		return trapInfo;
	}
	
}
