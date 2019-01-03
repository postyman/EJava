package chapter6;

public class TestTest {

	public static void main(String[] args) {
		
		Test myTest = new Test();
		
		myTest.print();
		
		double[] myArray = {1.5, 3.5, 5.0, 10.1};
		
		double result = myTest.sumArray(myArray);
		
		System.out.println(result);

	}

}
