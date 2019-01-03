package chapter4;

public class RightTriangleTest2 {

	public static void main(String[] args) {
		RightTriangle2 tri1 = new RightTriangle2();
		
		System.out.println(tri1);
		System.out.println("Triangle Hypotenuse (calc): " + tri1.hypotenuse());
		System.out.println("Triangle Perimeter: " + tri1.perimeter());
		System.out.println("Triangle Area: " + tri1.area());

		System.out.println();

		RightTriangle2 tri2 = new RightTriangle2(10, 20, 22.36);
		
		System.out.println(tri2);
		System.out.println("Triangle Hypotenuse (calc): " + tri2.hypotenuse());
		System.out.println("Triangle Perimeter: " + tri2.perimeter());
		System.out.println("Triangle Area: " + tri2.area());
	}

}
