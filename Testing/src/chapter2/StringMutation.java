package chapter2;

public class StringMutation {
	public static void main (String[] args) {
		String phrase = new String("Change is inevitable");
		String mutation1, mutation2, mutation3, mutation4;
		
		System.out.println("Original string: \"" + phrase + "\"");
		System.out.println("Length of string: " + phrase.length());
		System.out.println("");
		
		mutation1 = phrase.concat(", except from vending machines.");
		mutation2 = mutation1.toUpperCase();
		mutation3 = mutation2.replace('E', 'X');
		mutation4 = mutation3.substring(3, 30);
		
		System.out.println("Mutation1: \"" + mutation1 + "\"");
		System.out.println("Mutation2: \"" + mutation2 + "\"");
		System.out.println("Mutation3: \"" + mutation3 + "\"");
		System.out.println("Mutation4: \"" + mutation4 + "\"");

		System.out.println("Length of mutation4: " + mutation4.length());
	}
}