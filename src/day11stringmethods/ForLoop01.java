package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		
		//6 5 4 3 2 1 0 -1 yi ekrana yazdiran bir for loop olusturunuz.
		
		for (int i =6 ; i>-2 ; i--) {
			
			System.out.println(i);
			
		}
		
		// 3 4 5 6 7 sayilarini ekrana yazdiran for loop olusturun.
		
		for (int i = 3 ; i<8 ; i++) {
			System.out.println(i);
			
		}
	// ilk yuz sayma sayisini ekrana yan yana yazdiran ve aralarina bosluk koyan programi yazdirin
		
		for (int i =1 ;i<101 ; i++ ) {
			System.out.print(i + " ");
			
		}
		System.out.println( );
		for (int i =100; i>0 ; i--) {
			
			System.out.print(i + " ");
		}
		
		//ilk 50 cift sayma sayisini ekrana yazdiran for loop olusturunuz.
		System.out.println();
		for (int i = 2; i<101 ; i= i+2) {
			
			System.out.print(i + " ");
			
			
		}
	// ilk elli tek sayma sayisi
		
		for (int i = 1 ; i<100 ; i= i+2) {
			
			System.out.print(i + " ");
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
