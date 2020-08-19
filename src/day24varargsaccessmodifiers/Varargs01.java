package day24varargsaccessmodifiers;

public class Varargs01 {

	public static void main(String[] args) {
		// Varargs : Variable Argumants demek.
		// Bir method olusturdugunuzda argument olarak istedigimiz kadar 
		// argument girebildigimiz saglar
		
		countNum (5);
		countNum (5,7,9);
		countNum (5,7,9,11,13,15,19,21,28);
		sumNums(5,7,9,11,13,15,19,21,28,10.5);
		printName ("Ali", "Ahmet", "Can");
	}
	
	public static void countNum (int ... a) {
		System.out.println(a.length);
	}
	
	public static void sumNums ( double ... b) {
		
		double sum = 0;
		for(double w:b) {
			sum = sum + w;
		}
		System.out.println("Girilen tum sayilarin toplami: " + sum);
	}

	public static void printName (String ... n) {
		
		
		
		for (String w:n) {
			System.out.print(w + " ");
		}
		
	}
}
