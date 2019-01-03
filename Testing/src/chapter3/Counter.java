package chapter3;

public class Counter {

	public static void main(String[] args) {
		final int LIMIT = 5000;
		int counter = 1;
		
		while (counter < LIMIT) {
			System.out.print(counter);
			if ((counter%100)==0) {
				System.out.println("");
			}
			counter++;
		}
		System.out.println("");
		System.out.println("Done");

	}

}
