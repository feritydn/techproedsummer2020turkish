package day07nestedif;

import java.util.Scanner;

public class KutsalGunSorusu {

	public static void main(String[] args) {
		//Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. “Pazar” ise ekrana
		//“Hýristiyanlar icin kutsal gün” yazdýrýn
		// Diger gunler icin kutsal gun degil yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gun giriniz");
		
		String day = scan.next();
		
		if (day.equalsIgnoreCase("Cuma")) { // equalsIgnoreCase buyuk harf hassasiyatini kaldirir.
			System.out.println("Muslumanlar icin kutsal gun");
		}else if(day.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");

		}else if(day.equalsIgnoreCase("Pazar")) {
			System.out.println("Hiristiyanlar icin kutsal gun");

		}else {
			System.out.println("Kutsal gun degil");
		}
		
		scan.close();

	}

}
