package chapter2;

public class EnumTypes {
	//creating your own variable type limits the valid values it can take on
	enum Flavors {vanilla, chocolate, mintChip, caramel, superman};
	
	public static void main (String[] args) {
		//declare your variables with the custom variable type
		Flavors cone1, cone2, cone3, cone4;
		
		cone1 = Flavors.vanilla;
		cone2 = Flavors.mintChip;
		cone3 = Flavors.superman;
		cone4 = cone2;
		
		System.out.println("Cone 1: " + cone1);
		System.out.println("Cone 2: " + cone2);
		System.out.println("Cone 3: " + cone3);
		System.out.println("Cone 4: " + cone4);
		
	}
}
