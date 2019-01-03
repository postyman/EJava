package chapter4;

public class RightTriangleTest {

	public static void main(String[] args) {
		RightTriangle tri1 = new RightTriangle();
		RightTriangle tri2 = new RightTriangle(10, 20);
		
		System.out.println(tri1.getBase());
		System.out.println(tri1.getHeight());
		System.out.println();

		System.out.println(tri2.getBase());
		System.out.println(tri2.getHeight());
		System.out.println();
		
		tri2.setBase(15);
		tri2.setHeight(25);
		
		System.out.println(tri1);
		System.out.println("Triangle Hypotenuse: " + tri1.hypot());
		System.out.println("Triangle Perimeter: " + tri1.perimeter());
		System.out.println("Triangle Area: " + tri1.area());

		System.out.println();
		
		System.out.println(tri2);
		System.out.println("Triangle Hypotenuse: " + tri2.hypot());
		System.out.println("Triangle Perimeter: " + tri2.perimeter());
		System.out.println("Triangle Area: " + tri2.area());
	}

}
