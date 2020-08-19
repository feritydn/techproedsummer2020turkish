package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		
		// LastIndexOf() methodu aradigimiz chararcter in string
		//icindeki son gorunumunun index ini return eder.

		//LastIndexOf ( ) method 1. versiyon
		
		String str1 = "Sivrihisar";
		
		System.out.println(str1.lastIndexOf('i'));
			// ekrana alti yazdirir. Cunku en son i yi bulur
			// ve son i index return u 6 dir.
		
		System.out.println(str1.lastIndexOf('r'));
		
		// LastIndexOf ( ) method 2. versiyon
		
		System.out.println(str1.lastIndexOf('i', 7));
			// ilk 7 indexin icinded 'i' harfini 
			// indexinin return eder
		System.out.println(str1.lastIndexOf('i', 5));
	
		// LastIndexOf ( ) method 3. versiyon
		
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri"));
		
			// Stringin icindeki son "ri" nin gorununmunu bulacak
			// son "ri" nin r harfinin indexini return edecek.
		
		
		
	}

}
