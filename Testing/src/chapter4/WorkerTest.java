package chapter4;

import java.text.NumberFormat;

public class WorkerTest {

	public static void main(String[] args) {
		Worker john = new Worker();
		Worker brian = new Worker(20.0, 15.0);
		NumberFormat fmtMoney = NumberFormat.getCurrencyInstance();
		
		System.out.println("John: " + john);
		System.out.println("Brian: " + brian);

		System.out.println();
		
		System.out.println("John: " + john.getHours() + " hours.");
		System.out.println("John: " + fmtMoney.format(john.getRate()) + " per hour.");
		System.out.println("John: " + fmtMoney.format(john.payCheck()) + " check amount.");
		
		System.out.println();
		
		System.out.println("Brian: " + brian.getHours() + " hours.");
		System.out.println("Brian: " + fmtMoney.format(brian.getRate()) + " per hour.");
		System.out.println("Brian: " + fmtMoney.format(brian.payCheck()) + " check amount.");
		
		System.out.println();
		
		john.setHours(15.5);
		john.setRate(9.5);
		brian.setHours(26.75);
		brian.setRate(16.5);
		
		System.out.println("John: " + john);
		System.out.println("Brian: " + brian);
		
		System.out.println();
		
		System.out.println("John got a raise!");
		john.raise(1.5);
		System.out.println("John: " + john);

	}

}
