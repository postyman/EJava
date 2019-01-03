package chapter3;

public class Stars {

	public static void main(String[] args) {
		final int MAXROWS = 10;
		
		for (int row = 1; row <= MAXROWS; row++) {
			for (int stars = 1; stars <= row; stars++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
