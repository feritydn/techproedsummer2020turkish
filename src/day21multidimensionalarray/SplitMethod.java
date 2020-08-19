package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str1 = "Ali Can Okula Basladi, nasil oldu? Iyi oldu ama zor";
		
		// Split methodu kullandiginizda mutlaka bir array
		// olusturmaliyiz. cunku boldugumuz parcalar havada kalir.
		
		
		String kelime [] =	 str1.split(" ");
		
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime Sayisi:" +  kelime.length);
	
	
	
	String str2 = "Kahramanmaras";
	String harf[] = str2.split("");
	
	System.out.println(Arrays.toString(harf));
	
	System.out.println("Harf Sayisi: " + harf.length);
	
	
	
	}

}
