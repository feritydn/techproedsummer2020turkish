package day16overloading;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		
//		Kullanýcýdan isim ve soyismini alýn. Kullanýcýnýn isim ve soyisminin ilk harflerini büyük
//		diðer harflerini küçük harf olarak ekrana yazdýran programý yazýnýz.

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ilk isminizi giriniz");
		String isim = scan.next().toLowerCase();
		System.out.println(" Soyisminizi giriniz");
		String soyIsim = scan.next().toLowerCase();
		isimYazma(isim, soyIsim);
		scan.close();
	}
	
	public static void isimYazma(String isim, String soyIsim) {
		isim = isim.substring(0,1).toUpperCase() + isim.substring(1);
		soyIsim = soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1);

		System.out.println(isim  + " " + soyIsim );
		
	}

}
