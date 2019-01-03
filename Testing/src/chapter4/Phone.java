package chapter4;

public class Phone {
	private final String emergencyNumber = "911";
	private String myNumber, speedNumber, lastNumber;
	private int callNumber, callMinutes;
	
	
	//-----------------------------------------------------------------
	//default constructor
	public Phone() {
		myNumber = "0000000000";
		speedNumber = "0000000000";
		lastNumber = "0000000000";
		callNumber = 0;
		callMinutes = 0;
	}
	
	
	//-----------------------------------------------------------------
	//alternate constructor
	public Phone(String myN, String speedN) {
		myNumber = myN;
		speedNumber = speedN;
		lastNumber = "0000000000";
		callNumber = 0;
		callMinutes = 0;
	}
	
	
	//-----------------------------------------------------------------
	//get emergency number
	public String getEmergencyNumber() {
		return emergencyNumber;
	}
	
	
	//-----------------------------------------------------------------
	//get owner's phone number
	public String getMyNumber() {
		return myNumber;
	}
	
	
	//-----------------------------------------------------------------
	//get speed dial number
	public String getSpeedNumber() {
		return speedNumber;
	}
	
	
	//-----------------------------------------------------------------
	//get last number called
	public String getLastNumber() {
		return lastNumber;
	}
	
	
	//-----------------------------------------------------------------
	//get the number of calls made
	public int getCallNumber() {
		return callNumber;
	}
	
	
	//-----------------------------------------------------------------
	//get the number of calls minutes
	public int getCallMinutes() {
		return callMinutes;
	}
	
	
	//-----------------------------------------------------------------
	//set owner's phone number
	public String setMyNumber(String myNum) {
		myNumber = myNum;
		
		return myNumber;
	}
	
	
	//-----------------------------------------------------------------
	//set speed dial number
	public String setSpeedNumber(String speedNum) {
		speedNumber = speedNum;
		
		return speedNumber;
	}
	
	
	//-----------------------------------------------------------------
	//set last number called
	public String setLastNumber(String lastNum) {
		lastNumber = lastNum;
		
		return lastNumber;
	}
	
	
	//-----------------------------------------------------------------
	//set the number of calls made
	public int setCallNumber(int callNum) {
		callNumber = callNum;
		
		return callNumber;
	}
	
	
	//-----------------------------------------------------------------
	//set the number of calls minutes
	public int setCallMinutes(int callMin) {
		callMinutes = callMin;
		
		return callMinutes;
	}
	
	
	//-----------------------------------------------------------------
	//make a call - set last number called, increase the number of calls, increase number of minutes, return info
	public String makeCall(String calledNumber, int callMin) {
		lastNumber = calledNumber;
		callNumber += 1;
		callMinutes += callMin;
		
		String callInfo = "Number Called: " + lastNumber.substring(0,3) + "-" + lastNumber.substring(3,6) + "-" + lastNumber.substring(6,10) + ";\n" + 
				"Length of Call: " + callMin + "minutes;\n\n";

		return callInfo;
	}
	

	//-----------------------------------------------------------------
	//default string return
	public String toString() {
		String phoneInfo = "My Number: " + myNumber.substring(0,3) + "-" + myNumber.substring(3,6) + "-" + myNumber.substring(6,10) + ";\n" + 
				"Speed Dial Number: " + speedNumber.substring(0,3) + "-" + speedNumber.substring(3,6) + "-" + speedNumber.substring(6,10) + ";\n" + 
				"Last Number Called: " + lastNumber.substring(0,3) + "-" + lastNumber.substring(3,6) + "-" + lastNumber.substring(6,10) + ";\n" + 
				"Number of Calls Made: " + callNumber + ";\n" + 
				"Number of Minutes Used: " + callMinutes + ";\n\n";

		return phoneInfo;
	}
	
	
	
}
