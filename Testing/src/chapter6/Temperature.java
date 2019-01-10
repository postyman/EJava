package chapter6;

import java.util.Random;

public class Temperature {

	public static void main(String[] args) {
		Random rand = new Random();
		final int YEARS = 10;
		final int MONTHS = 12;
		final int WEEKS = 4;
		final int DAYS = 7;
		int year = 0, month = 0, week = 0, day = 0, yearm = 0, monthm = 0; 
		double temp, tempHigh = -20.0, tempSum = 0, tempAvg, tempAvgHigh = -20.0;
		
		double[][][][] temps = new double[YEARS][MONTHS][WEEKS][DAYS];
		
		//fill the 4-dimensional array with random temperature data
		for (int y=0; y<YEARS; y++) {
			for (int m=0; m<MONTHS; m++) {
				for (int w=0; w<WEEKS; w++) {
					for (int d=0; d<DAYS; d++) {
						temp = ((rand.nextInt(1301) - 200)/10.0);
						temps[y][m][w][d] = temp;
						
						//get the highest daily temp
						if (temp > tempHigh) {
							tempHigh = temp;
							year = y + 1;
							month = m + 1;
							week = w + 1;
							day = d + 1;
						}
						
						//sum the temperatures for the monthly average
						tempSum += temp;
					}
				}
				//get the highest monthly average temp
				tempAvg = tempSum/DAYS/WEEKS;
				if (tempAvg > tempAvgHigh) {
					tempAvgHigh = tempAvg;
					yearm = y + 1;
					monthm = m + 1;
				}
				tempSum = 0;
			}
		}
		
		System.out.println("The highest temperature recorded was " + temps[year-1][month-1][week-1][day-1] + " degrees Fahrenheit");
		System.out.println("In Year " + year + ", Month " + month + ", Week " + week + ", Day " + day);
		
		System.out.println();
		
		System.out.println("The highest average monthly temperature recorded was " + tempAvgHigh + " degrees Fahrenheit");
		System.out.println("In Year " + year + ", Month " + month);
		
		System.out.println();
		
		for (int m=0; m<MONTHS; m++) {
			for (int w=0; w<WEEKS; w++) {
				for (int d=0; d<DAYS; d++) {
					System.out.print(temps[0][m][w][d] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
