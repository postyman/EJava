package chapter4;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence;
		String vowels = "aeiouy";
		String consonents = "bcdfghjklmnpqrstvwxz";
		String punctuation = ".?!'\",";
		int length = 0, vow = 0, cons = 0, punct = 0, space = 0;
		
		System.out.println("Please type a sentence and you will be told how many vowels, consonents, and punctuation marks are in it:");
		sentence = scan.nextLine();
		sentence = sentence.toLowerCase();
		
		length = sentence.length();
		
		for (int i=0; i<length; i++) {
			char letter = sentence.charAt(i);
			if (vowels.indexOf(letter) != -1) {
				vow++;
			} else if (consonents.indexOf(letter) != -1) {
				cons++;
			} else if (punctuation.indexOf(letter) != -1) {
				punct++;
			} else {
				space++;
			}
		}
		
		System.out.println();
		System.out.println("The number of vowels: " + vow);
		System.out.println("The number of consonents: " + cons);
		System.out.println("The number of punctuation marks: " + punct);
		System.out.println("The number of spaces: " + space);
		
		scan.close();
	}

}
