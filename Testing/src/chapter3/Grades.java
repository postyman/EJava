package chapter3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Grades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.##");
		double class1, class2, class3, classGPA = 0.0, classAVG;
		
		System.out.println("Please enter your three class percentages:");
		class1 = scan.nextDouble();
		class2 = scan.nextDouble();
		class3 = scan.nextDouble();

		if (class1 >= 60.0) {
			if (class1 >= 70.0) {
				if (class1 >= 80.0) {
					if (class1 >= 90.0) {
						System.out.println("class1 grade is: A");
						classGPA += 4.0;
					} else {
						System.out.println("class1 grade is: B");
						classGPA += 3.0;
					}
				} else {
					System.out.println("class1 grade is: C");
					classGPA += 2.0;
				}
			} else {
				System.out.println("class1 grade is: D");
				classGPA += 1.0;
			}
		} else {
			System.out.println("class1 grade is: F");
			classGPA += 0.0;
		}

		if (class2 >= 60.0) {
			if (class2 >= 70.0) {
				if (class2 >= 80.0) {
					if (class2 >= 90.0) {
						System.out.println("class2 grade is: A");
						classGPA += 4.0;
					} else {
						System.out.println("class2 grade is: B");
						classGPA += 3.0;
					}
				} else {
					System.out.println("class2 grade is: C");
					classGPA += 2.0;
				}
			} else {
				System.out.println("class2 grade is: D");
				classGPA += 1.0;
			}
		} else {
			System.out.println("class2 grade is: F");
			classGPA += 0.0;
		}

		if (class3 >= 60.0) {
			if (class3 >= 70.0) {
				if (class3 >= 80.0) {
					if (class3 >= 90.0) {
						System.out.println("class3 grade is: A");
						classGPA += 4.0;
					} else {
						System.out.println("class3 grade is: B");
						classGPA += 3.0;
					}
				} else {
					System.out.println("class3 grade is: C");
					classGPA += 2.0;
				}
			} else {
				System.out.println("class3 grade is: D");
				classGPA += 1.0;
			}
		} else {
			System.out.println("class3 grade is: F");
			classGPA += 0.0;
		}

		classAVG = classGPA / 3.0;
		
		if (classAVG >= 60.0) {
			if (classAVG >= 70.0) {
				if (classAVG >= 80.0) {
					if (classAVG >= 90.0) {
						System.out.println("Your class average GPA is: " + fmt.format(classAVG));
					} else {
						System.out.println("Your class average GPA is: " + fmt.format(classAVG));
					}
				} else {
					System.out.println("Your class average GPA is: " + fmt.format(classAVG));
				}
			} else {
				System.out.println("Your class average GPA is: " + fmt.format(classAVG));
			}
		} else {
			System.out.println("Your class average GPA is: " + fmt.format(classAVG));
		}
		
		scan.close();


	}

}
