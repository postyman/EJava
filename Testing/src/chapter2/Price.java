package chapter2;

import java.util.Scanner;
import java.text.NumberFormat;

public class Price {
	public static void main (String[] args) {
		final double TAXRATE = 0.06;
		
		int quantity;
		double unitPrice, subtotal, tax, totalCost;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the quantity: ");
		quantity = scan.nextInt();
		
		System.out.println("Enter the unit price: ");
		unitPrice = scan.nextDouble();
		
		subtotal = quantity * unitPrice;
		tax = subtotal * TAXRATE;
		totalCost = subtotal + tax;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.println("Subtotal: " + money.format(subtotal));
		System.out.println("Tax: " + money.format(tax) + " at " + percent.format(TAXRATE));
		System.out.println("Total: " + money.format(totalCost));
		
		scan.close();
		
	}
}
