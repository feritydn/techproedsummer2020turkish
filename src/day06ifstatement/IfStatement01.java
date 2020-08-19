package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {
		
		// if statement yazmak icin "if () {}" yapilir.
		// condition kelimesi cok onemli.
		
		
		if (3>2) {
			System.out.println("if body calisti");
			
		}
       
		System.out.println("if body calismadi");
		
		// bir int variable olusturun ve ona bir deger atayin
		// eger atadiginiz deger pozitif ise ekrena "pozitif" yazdirin
		// eger atadiginiz deger negatif ise ekrana "negatif" yazdirin.
		
	    int num1 =12;
	    
	    if(num1>0) { 
	    	System.out.println("Pozitif");
	    	
	    }
		
	    if(num1<0) {
	    	System.out.println("Negatif");
	    	
	    }
	    
	    if (num1 == 0) {
	    	
	    	System.out.println("notr");
	    }
		
	}

}
