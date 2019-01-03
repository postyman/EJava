package chapter6;

public class Test {
	
	public Test() {
		
	}
	
	public void modParams(int[] x, int[] y, String[] s) {
		x[1] =5;
		y = x;
		s[1] = new String("five");
		s = new String[3];
		s[1] = new String("six");
	}
	
	public void print() {
		int[] a = {1,2,3};
		int[] b = {11,22,33};
		String[] s = {"one", "two", "three"};
		modParams(a,b,s);
		System.out.println(a[1] + " " + b[1] + " " + s[1]);
	}
	
	public double sumArray(double[] array) {
		double sum = 0;
		
		for (int i=0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}
	
}
