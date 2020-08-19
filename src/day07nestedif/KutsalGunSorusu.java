package day07nestedif;

import java.util.Scanner;

public class KutsalGunSorusu {

	public static void main(String[] args) {
		//Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
		//�Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. �Pazar� ise ekrana
		//�H�ristiyanlar icin kutsal g�n� yazd�r�n
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
