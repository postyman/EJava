package chapter4;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence, result, another;
		PigLatinTranslator translator = new PigLatinTranslator();
		
		do {
			System.out.println();
			System.out.println("Enter a sentence (no punctuation):");
			sentence = scan.nextLine();
			
			System.out.println();
			result = translator.translate(sentence);
			System.out.println("That sentence in Pig Latin is:");
			System.out.println(result);
			
			System.out.println();
			System.out.print("Translate another sentence (y/n)? ");
			another = scan.nextLine();
			
		} while (another.equalsIgnoreCase("y"));
		
		scan.close();
	}

}
