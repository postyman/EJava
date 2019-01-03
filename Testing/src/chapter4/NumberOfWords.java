package chapter4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence, another = "y";
		
		while (another.equalsIgnoreCase("y")) {
			int words = 0;
			
			System.out.println();
			System.out.println("Please type a sentence and each word will be printed out and you will be told how many words are in it:");
			sentence = scan.nextLine();
			System.out.println();
			StringTokenizer tokens = new StringTokenizer(sentence);
			
			while (tokens.hasMoreTokens()) {
				System.out.println(tokens.nextToken());
				words++;
			}
			
			System.out.println("Total number of words: " + words);
			System.out.println();
			
			System.out.print("Would you like to do another sentence (y/n)? ");
			another = scan.nextLine();
		}
		
		scan.close();
	}

}
