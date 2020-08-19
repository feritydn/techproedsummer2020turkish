package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
		// kullanicidan Integer aldiktan sonra String alamiyoruz.
		
		Scanner scan =new Scanner(System.in);
		// java'da nextInt kullandiktan sonra nextLine kullanirsak kod calismaz
		// nextInt yerine nextLine kullan ve sonra elde ettigin Stringi
		// Integer.parseInt( ) kullanarak integere cevir.
		// Integer.parseInt( ) sadece rakam iceren Stringler icin calisir
		
		System.out.println("yasinizi giriniz.");
		
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas);
		System.out.println(yeniYas);
		
		System.out.println("Adinizi ve soy adinizi giriniz.");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		scan.close();


	}

}
