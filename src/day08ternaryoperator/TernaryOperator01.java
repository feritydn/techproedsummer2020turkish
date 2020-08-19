package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {

		// kullanicidan bir sayi aliniz
		// sayi pozitif veya 0 ise ekrana pozitif veya 0 yaziniz
		// negatif ise ekrana negatif yaziniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int num = scan.nextInt();
		
		if (num >= 0) {
			System.out.println("pozitif veya 0");
		}else{
			System.out.println("negatif");
		}
			
		                    // Ternary Operator if else
		
		            // condation ==> ? ==> dogru ise ==> : ==> yanlis ise ==>
		
	String sonuc =	(num >=0)        ?    "Pozitif veya 0"  :  "Negatif" ;  
	System.out.println(sonuc);
	scan.close();
	}

}
