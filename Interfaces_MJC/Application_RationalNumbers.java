
public class Application_RationalNumbers {

	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(7, 5);
		RationalNumber r2 = new RationalNumber(7, 5);
		
		System.out.println("When comparing rational number 1 with rational number 2: "+r1.compareTo(r2));
		
		RationalNumber r3 = new RationalNumber(7, 5);
		RationalNumber r4 = new RationalNumber(7, 10);
		
		System.out.println("\nWhen comparing rational number 3 with rational number 4: "+r3.compareTo(r4));
		
		RationalNumber r5 = new RationalNumber(7, 5);
		RationalNumber r6 = new RationalNumber(7, 3);
		
		System.out.println("\nWhen comparing rational number 5 with rational number 6: "+r5.compareTo(r6));

	}//end main

}//end class
