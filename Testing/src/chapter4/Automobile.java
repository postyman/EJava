package chapter4;

import java.text.DecimalFormat;

public class Automobile {
	private double mpg; //car's fuel efficiency in miles per gallon
	private double tank; //car's fuel tank capacity
	private double fuel; //amount of fuel put into the car
	private double odometer; //car's current odometer reading
	private double milesDriven; //calculated when refueling
	private DecimalFormat fmtOne = new DecimalFormat("0.#");
	

	//-----------------------------------------------------------------
	//default constructor
	public Automobile() {
		mpg = 20.0;
		tank = 20.0;
		odometer = 0.0;
	}
	

	//-----------------------------------------------------------------
	//alternate constructor - pass in mpg, tank size in gallons, odometer reading
	public Automobile(double m, double t, double o) {
		mpg = m;
		tank = t;
		odometer = o;
	}
	

	//-----------------------------------------------------------------
	//get car's fuel efficiency in mpg
	public double getMPG() {
		return mpg;
	}
	

	//-----------------------------------------------------------------
	//get car's tank size in gallons
	public double getTank() {
		return tank;
	}
	

	//-----------------------------------------------------------------
	//get how many gallons of fuel were put into the car
	public double getFuel() {
		return fuel;
	}
	

	//-----------------------------------------------------------------
	//get car's current odometer reading in miles
	public double getOdometer() {
		return odometer;
	}
	

	//-----------------------------------------------------------------
	//set car's fuel efficiency in mpg
	public double setMPG(double m) {
		mpg = m;
		
		return mpg;
	}
	

	//-----------------------------------------------------------------
	//set car's tank size in gallons
	public double setTank(double t) {
		tank = t;
		
		return tank;
	}
	

	//-----------------------------------------------------------------
	//set how many gallons of fuel were put into the car
	public double setFuel(double f) {
		fuel = f;
		
		return fuel;
	}
	

	//-----------------------------------------------------------------
	//set car's current odometer reading in miles
	public double setOdometer(double o) {
		odometer = o;
		
		return odometer;
	}
	

	//-----------------------------------------------------------------
	//calculate car's fuel efficiency (mpg) from gallons filled and current odometer reading in miles
	public double refuel(double f, double o) {
		milesDriven = o - odometer; //get miles driven by subtracting previous odemeter from current odometer
		odometer = o; //set odometer to current odometer reading
		
		fuel = f;
		mpg = milesDriven / f;
		
		return mpg;
	}
	

	//-----------------------------------------------------------------
	//default string return
	public String toString() {
		String autoInfo = "Tank Capacity: " + fmtOne.format(tank) + ";\n" + 
				"Fuel Added: " + fmtOne.format(fuel) + ";\n" + 
				"Miles Driven: " + fmtOne.format(milesDriven) + ";\n" + 
				"MPG: " + fmtOne.format(mpg) + ";\n" + 
				"Current Odometer: " + fmtOne.format(odometer) + ";\n\n";

		return autoInfo;
	}
	
}
