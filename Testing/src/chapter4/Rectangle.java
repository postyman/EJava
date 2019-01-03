package chapter4;

import java.text.DecimalFormat;

public class Rectangle {
	private double length;
	private double width;
	private DecimalFormat fmtTwo = new DecimalFormat("0.##");
	
	//-----------------------------------------------------------------
	//default constructor
	public Rectangle() {
		length = 3.0;
		width = 4.0;
	}
	
	
	//-----------------------------------------------------------------
	//alternate constructor
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	
	//-----------------------------------------------------------------
	//get the length of the rectangle
	public double getLength() {
		return length;
	}
	
	
	//-----------------------------------------------------------------
	//get the width of the rectangle
	public double getWidth() {
		return width;
	}
	
	
	//-----------------------------------------------------------------
	//set the length of the rectangle
	public double setLength(double l) {
		length = l;
		
		return length;
	}
	
	
	//-----------------------------------------------------------------
	//set the width of the rectangle
	public double setWidth(double w) {
		width = w;
		
		return width;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the rectangle's perimeter
	public double perimeter() {
		double per = (length + width) * 2;
		
		return per;
	}
	
	
	//-----------------------------------------------------------------
	//calculate the rectangle's area
	public double area() {
		double a = length * width;
		
		return a;
	}

	
	//-----------------------------------------------------------------
	//default string return
	public String toString() {
		String triInfo = "Rectangle Length: " + fmtTwo.format(length) + ";\n" + 
				"Rectangle Width: " + fmtTwo.format(width) + ";\n";

		return triInfo;
	}
	
}
