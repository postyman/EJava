package chapter4;

import java.text.DecimalFormat;

public class Circle {
	private double radius;
	private DecimalFormat fmtTwo = new DecimalFormat("0.##");
	
	//-----------------------------------------------------------------
	//default constructor
	public Circle() {
		radius = 3.0;
	}
	
	
	//-----------------------------------------------------------------
	//alternate constructor
	public Circle(double r) {
		radius = r;
	}
	
	
	//-----------------------------------------------------------------
	//get the radius of the circle
	public double getRadius() {
		return radius;
	}
	
	
	//-----------------------------------------------------------------
	//set the radius of the circle
	public double setRadius(double r) {
		radius = r;
		
		return radius;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the circle's circumference
	public double circumference() {
		double cir = (2 * Math.PI * radius);
		
		return cir;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the circle's area
	public double area() {
		double a = Math.PI * radius * radius;
		
		return a;
	}

	
	//-----------------------------------------------------------------
	//default string return
	public String toString() {
		String triInfo = "Circle Radius: " + fmtTwo.format(radius) + ";\n";

		return triInfo;
	}
	
}
