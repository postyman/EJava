package chapter4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmtTwo = new DecimalFormat("0.##");
		
		System.out.println("What is the length of the rectangle?");
		double rectLength = scan.nextDouble();
		System.out.println("What is the width of the rectangle?");
		double rectWidth = scan.nextDouble();
		System.out.println();
		Rectangle rect = new Rectangle(rectLength, rectWidth);
		
		System.out.println("What is the radius of the circle?");
		double cirRadius = scan.nextDouble();
		System.out.println();
		Circle circ = new Circle(cirRadius);
		
		System.out.println("What is the base of the right triangle?");
		double rtBase = scan.nextDouble();
		System.out.println("What is the height of the right triangle?");
		double rtHeight = scan.nextDouble();
		System.out.println();
		RightTriangle tri = new RightTriangle(rtBase, rtHeight);
		
		System.out.println("What is base one of the isosceles trapezoid?");
		double itBase1 = scan.nextDouble();
		System.out.println("What is base two of the isosceles trapezoid?");
		double itBase2 = scan.nextDouble();
		System.out.println("What is the height of the isosceles trapezoid?");
		double itHeight = scan.nextDouble();
		System.out.println();
		IsosTrapezoid trap = new IsosTrapezoid(itBase1, itBase2, itHeight);
		
				
		System.out.println("Rectangle\n" + rect +  
				"Perimeter: " + fmtTwo.format(rect.perimeter()) + "\n" + 
				"Area: " + fmtTwo.format(rect.area()));
		System.out.println();
		
		System.out.println("Circle\n" + circ +  
				"Circumference: " + fmtTwo.format(circ.circumference()) + "\n" + 
				"Area: " + fmtTwo.format(circ.area()));
		System.out.println();
		
		System.out.println("Right Triangle\n" + tri + 
				"Perimeter: " + fmtTwo.format(tri.perimeter()) + "\n" + 
				"Area: " + fmtTwo.format(tri.area()));
		System.out.println();
		
		System.out.println("Isosceles Trapezoid\n" + trap  + 
				"Perimeter: " + fmtTwo.format(trap.perimeter()) + "\n" + 
				"Area: " + fmtTwo.format(trap.area()));
		System.out.println();
		
		
		scan.close();
	}

}
