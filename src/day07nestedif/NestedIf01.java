package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin 
		//bu sayi pozitif ise 9 dan buyuk mu diye kontrol edin
		// 9 dan buyukse ekrana sayi yazdirin.
		// 9 dan kucuk esit ve sifirdan buyuk esit ise ekrana rakam yadirtin
		// negatif ise ekrana sayi yazdirin

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsayi giriniz");
		
		int num = scan.nextInt();
		// nestedif if icinde if demek.
		
		if (num >= 0) {
			
			if (num >9) {
				System.out.println("Sayi");
			}else if (num <=9 && num >=0 ) {
				System.out.println("Rakam");
				
			}else if (num<0) {
				System.out.println("Sayi");
			}
			
		}
		
		scan.close();// scanner class ini kullandiktan sonra
		             // en altta main methodun icine scanner 
		            // class ini "scan.close();" yontemi ile kapatin.

		
		
		
	}

}
