package chapter4;

import java.util.Scanner;

public class GuidanceCounselor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String counselor1 = "Mr. Williams", counselor2 = "Mrs. Smith", counselor3 = "Mrs. Johnson", counselor4 = "Mr. Bond";
		String name, nameLower, counselor1List = "", counselor2List = "", counselor3List = "", counselor4List = "";
		boolean exitEntry = false;
		char nameCharOne, nameCharTwo;
		int charIntOne, charIntTwo;
		
		System.out.println();
		System.out.println("Please enter the last name of each student so they can be placed with the proper guidance counselor.");
		System.out.println();
		
		do {
			System.out.print("Name (? to quit): ");
			name = scan.nextLine();
			nameLower = name.toLowerCase();
			nameCharOne = nameLower.charAt(0);
			charIntOne = nameCharOne;
			
			if (nameCharOne == '?') {
				exitEntry = true;
				break;
			}
			
			if (nameLower.length()>1) {
				nameCharTwo = nameLower.charAt(1);
				charIntTwo = nameCharTwo;
				
				if (charIntOne < 104) {
					counselor1List += (name + "\n");
				} else if (charIntOne > 103 && charIntOne < 111) {
					counselor2List += (name + "\n");
				} else if (charIntOne > 110 && charIntOne < 116 && charIntTwo < 117) {
					counselor3List += (name + "\n");
				} else {
					counselor4List += (name + "\n");
				}
				
				
			}
			
		} while (!exitEntry);
		
		System.out.println();
		System.out.println(counselor1);
		System.out.println(counselor1List);
		System.out.println(counselor2);
		System.out.println(counselor2List);
		System.out.println(counselor3);
		System.out.println(counselor3List);
		System.out.println(counselor4);
		System.out.println(counselor4List);
		
		
		scan.close();
	}

}
