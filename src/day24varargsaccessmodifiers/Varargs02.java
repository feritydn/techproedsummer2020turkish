package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// Varargs'in yanlis kullanimlari
		
		// Kural 1: varargs her zaman son parametre olmalidir.
		// Cunku ilk parametre girdiginiz her deger varargs in icine duser
		
		
		// Parametre olarak birden fazla varargs kullanamazisiniz 
		
		
		
		valueChar("valueChar: ", 'a','b','c');
		
		product(5,1,2,3,4);
	}
	
	public static void valueChar (String s,char ... c) {
		int sum =0;
		for (char w:c) {
			sum = sum+w;
			
		}
		System.out.println(s + sum);
	}
	
	public static void product (int y, int ... x) {
		
		int product = 1;
		for ( int w:x) {
			product = product*w;
		}
		System.out.println(product*y);
	}

}
