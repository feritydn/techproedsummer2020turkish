package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		
		// Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin 
		// bastan ikinci harfi ile sondan ikinci harfini
	    // büyük harf olarak ekrana yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("yasadiginiz ulkenin ismini giriniz");
		
		String ulke = scan.nextLine();
		
	
		
		// Almanya 
		System.out.println(ulke.toUpperCase().charAt(1)); // ikinci harfin indexi 1 dir
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));
		
		// Buyuk harfe cevirme
		
		scan.close();

	}

}
