package chapter4;

public class IsosTrapezoidTest {

	public static void main(String[] args) {
		IsosTrapezoid trap1 = new IsosTrapezoid();
		IsosTrapezoid trap2 = new IsosTrapezoid(10, 20, 5);
		
		System.out.println(trap1.getBaseOne());
		System.out.println(trap1.getBaseTwo());
		System.out.println(trap1.getHeight());
		System.out.println();

		System.out.println(trap2.getBaseOne());
		System.out.println(trap2.getBaseTwo());
		System.out.println(trap2.getHeight());
		System.out.println();
		
		trap2.setBaseOne(15);
		trap2.setBaseTwo(5);
		trap2.setHeight(25);
		
		System.out.println(trap1);
		System.out.println("Trapezoid Leg: " + trap1.leg());
		System.out.println("Trapezoid Perimeter: " + trap1.perimeter());
		System.out.println("Trapezoid Area: " + trap1.area());

		System.out.println();
		
		System.out.println(trap2);
		System.out.println("Trapezoid Leg: " + trap2.leg());
		System.out.println("Trapezoid Perimeter: " + trap2.perimeter());
		System.out.println("Trapezoid Area: " + trap2.area());

	}

}
