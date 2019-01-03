package chapter4;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Worker {
	private double hours; //number of hours worked
	private double rate; //hourly rate of pay
	private NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
	private DecimalFormat fmtDecimal = new DecimalFormat("0.##");
		
	//-----------------------------------------------------------------
	//default constructor
	public Worker() {
		hours = 0.0;
		rate = 8.50;
	}
	

	//-----------------------------------------------------------------
	//alternate constructor - pass in hours worked and rate of pay
	public Worker(double h, double r) {
		hours = h;
		rate = r;
	}
	
	
	//-----------------------------------------------------------------
	//get hours worked
	public double getHours() {
		return hours;
	}
	
	
	//-----------------------------------------------------------------
	//get hourly rate of pay
	public double getRate() {
		return rate;
	}
	
	
	//-----------------------------------------------------------------
	//set hours worked
	public double setHours(double h) {
		hours = h;

		return hours;
	}
	
	
	//-----------------------------------------------------------------
	//set hourly rate of pay
	public double setRate(double r) {
		rate = r;

		return rate;
	}
	
	
	//-----------------------------------------------------------------
	//calculate and return paycheck
	public double payCheck() {
		double pay = hours * rate;

		return pay;
	}
	

	//-----------------------------------------------------------------
	//give a raise by adding to the rate
	public double raise(double raise) {
		rate = rate + raise;

		return rate;
	}
	

	//-----------------------------------------------------------------
	//default string return
	public String toString() {
		String workerInfo = fmtDecimal.format(hours) + " hours at " + fmtCurrency.format(rate) + " per hour = " + fmtCurrency.format(payCheck());

		return workerInfo;
	}
		
}
