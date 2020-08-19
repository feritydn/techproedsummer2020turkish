package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		
		// bir Char variable olusturun ve bir buyuk harf deger atayin.
		// eger atana deger haftanin gunlerinden herhangi birinin bas harfi ise
		// o gunleri yazdirin
		// degil ise "boyle bir gun yok"
		
		char harf ='Z';
		
		if (harf == 'P') {
			
			System.out.println("pazar Pazartesi Persembe");
				
		}

		if (harf =='S') {
			System.out.println("Sali");
			
		}
		
		if (harf =='C') {
			
			System.out.println("Cuma Cumartesi Carsamba");
			
					
		}
		// P, C VEYA S olamamak demek    || ==> Double pipe
		// veya islemi icin || kullaniriz (shif ve enterin usutundeki tus)
		// veya "||" her hangi bir tanesi True ise sonuc True dir	
		
		// ve elde etmek icin && ==> Double end
		// ve "&&" hepsinin true olmasi lazim. Bir condition false ise sonuc false olur
		if (harf !='P' && harf !='C'&&  harf != 'S') {
		  
		
			System.out.println("Boyle bir gun yok");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
