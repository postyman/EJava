package chapter2;

public class TempConverter {
	public static void main (String[] args) {
		double celI, farI, celO, farO;
		final double BASE = 32;
		final double CONVERSION = 9.0/5.0; //these need to be decimals even though it is declared as double (9/5 will not work)
		
		celI = 100;
		farI = 212;
		
		farO = (celI*CONVERSION) + BASE;
		celO = (farI - BASE)/CONVERSION;
		
		System.out.println(celI + " degrees Celcius is " + farO + " degrees Fahrenheit");
		System.out.println(farI + " degrees Fahrenheit is " + celO + " degrees Celcius");
		
	}
}
