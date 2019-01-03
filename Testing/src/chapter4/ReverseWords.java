package chapter4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence, nextWord, nextWordRev, endPunct = "", newSentence = "";
		String punctuation = ".?!,";
		
		System.out.println();
		System.out.println("Please type a sentence and each word will be reversed within the sentence:");
		sentence = scan.nextLine();
		System.out.println();
		StringTokenizer tokens = new StringTokenizer(sentence);
		
		while (tokens.hasMoreTokens()) {
			nextWord = tokens.nextToken();
			nextWordRev = "";
			endPunct = "";
			
			if (punctuation.indexOf(nextWord.substring(nextWord.length() - 1)) != -1) {
				endPunct += nextWord.substring(nextWord.length() - 1);
				nextWord = nextWord.substring(0, (nextWord.length() - 1));
			}
			
			for (int i=(nextWord.length() - 1); i>=0; i--) {
				nextWordRev += nextWord.charAt(i);
			}
			
			nextWordRev += endPunct;
			
			newSentence += nextWordRev;
			newSentence += " ";
		}
		
		System.out.println("Your new sentence is:");
		System.out.println(newSentence );
		
		scan.close();
	}

}
