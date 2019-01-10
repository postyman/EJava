package chapter6;

import java.util.Scanner;

public class SeatingChart1 {

	public static void main(String[] args) {
		Scanner scanNum = new Scanner(System.in);
		Scanner scanName = new Scanner(System.in);
		int num;
		String name;
		
		System.out.println("How many students are in the class (must be a multiple of 4)?");
		num = scanNum.nextInt();
		System.out.println();
		
		while ((num % 4)!=0) {
			System.out.println("The number of students must be a multiple of 4.");
			num = scanNum.nextInt();
			System.out.println();
		}
		
		String[][] seating = new String[(num/4)][4];
		
		for (int r=0; r<(num/4); r++) {
			for (int c=0; c<4; c++) {
				System.out.println("Student " + (4*r+c+1) + " name: ");
				name = scanName.nextLine();
				seating[r][c] = name;
			}
		}

		System.out.println();
		
		for (int r=0; r<(num/4); r++) {
			System.out.print("Row " + (r+1) + " initial: \t");
			for (int c=0; c<4; c++) {
				System.out.print(seating[r][c].substring(0,1) + "\t");
			}
			System.out.println();
		}

		System.out.println();
		
		for (int r=0; r<(num/4); r++) {
			System.out.print("Row " + (r+1) + " name length: \t");
			for (int c=0; c<4; c++) {
				System.out.print(seating[r][c].length() + "\t");
			}
			System.out.println();
		}
		
		scanNum.close();
		scanName.close();
	}

}
