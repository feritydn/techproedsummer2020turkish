package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		// kullanicidan Pasword g'rmesini isteyin.
		// pessword dogru ise "Password dogru yazdirin.
		// password yanlis ise "Password yanlis. tekrar deneyin"
		// Dogru pssword = java2020
		
		Scanner scan = new Scanner( System.in);
		
		System.out.println("Lutfen password giriniz.");
		
		String password = scan.next();
		
		// java string icin bir reference olusturdu
		// bizim yazdigimiz password icin  de bir reference olusturdu
		// ikisi ayni degil. Deger ayni ama adres ayni degil.
		// javanin adres kontrolunu engelleyecegiz
		// cift esittiri sil ve nokta koy sonra equals seciyoruz.
		// stringler esit mi diye kontrol ederken "eguals" yaziyoruz.
		
		// "==" Stringin adresinin ve degerinin kontrol eder.
		// "eguals" ise sadece degerleri kontrol eder.
		
		if(password .equals("Java2020")) {
			System.out.println("Password dogru");
		}else {
			System.out.println("Password yanlis. Tekrar deneyin");
		}
		scan.close();

	}

}
