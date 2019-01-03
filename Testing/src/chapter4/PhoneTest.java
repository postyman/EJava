package chapter4;

public class PhoneTest {

	public static void main(String[] args) {
		Phone brianPhone = new Phone("2625381799", "8474206578");
		Phone genericPhone = new Phone();
		
		System.out.println(brianPhone.getMyNumber());
		System.out.println(brianPhone.getSpeedNumber());
		System.out.println(brianPhone.getLastNumber());
		System.out.println(brianPhone.getEmergencyNumber());
		System.out.println(brianPhone.getCallNumber());
		System.out.println(brianPhone.getCallMinutes());
		
		System.out.println();
		
		System.out.println(genericPhone.getMyNumber());
		System.out.println(genericPhone.getSpeedNumber());
		System.out.println(genericPhone.getLastNumber());
		System.out.println(genericPhone.getEmergencyNumber());
		System.out.println(genericPhone.getCallNumber());
		System.out.println(genericPhone.getCallMinutes());
		
		System.out.println();
		
		brianPhone.makeCall("9206825808", 22);
		
		genericPhone.setMyNumber("1234567890");
		genericPhone.setSpeedNumber("0987654321");
		genericPhone.setLastNumber("1112223333");
		genericPhone.setCallNumber(45);
		genericPhone.setCallMinutes(546);
		
		System.out.println(genericPhone.getMyNumber());
		System.out.println(genericPhone.getSpeedNumber());
		System.out.println(genericPhone.getLastNumber());
		System.out.println(genericPhone.getEmergencyNumber());
		System.out.println(genericPhone.getCallNumber());
		System.out.println(genericPhone.getCallMinutes());
		
		System.out.println();
		
		genericPhone.makeCall("8009998888", 54);
		
		System.out.println(genericPhone.getMyNumber());
		System.out.println(genericPhone.getSpeedNumber());
		System.out.println(genericPhone.getLastNumber());
		System.out.println(genericPhone.getEmergencyNumber());
		System.out.println(genericPhone.getCallNumber());
		System.out.println(genericPhone.getCallMinutes());
		
		System.out.println();		
		
		
		System.out.println(brianPhone);
		System.out.println(genericPhone);
	}

}
