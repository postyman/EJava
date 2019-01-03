package chapter3;

public class Counter2 {

	public static void main(String[] args) {
		final int LIMIT = 5000;
		
		for (int counter = 1; counter < LIMIT; counter++) {
			System.out.print(counter);
			if ((counter%100)==0) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("Done");

	}

}
