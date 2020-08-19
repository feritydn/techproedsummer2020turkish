package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		
		// CharAt() methodu belli index teki characteri return eder.
		
		String str1 = "cimbombom";
		
		// str1 in 4. indexindeki charecterindeki bulan 
		// kodu yaziniz.
		
		System.out.println(str1.charAt(4));
		
			// index i dort olan charecter o harfi
		
		System.out.println(str1.charAt(0));
			// index 0 ilk harf demek bu yuzden c
		System.out.println(str1.charAt(6));
			// 10 yazarsak hata verir
			// olmayan bir index ile islem yapmaya calisirsaniz "exception' alirsiniz
			//Bu da buyuk bir hata yaptiniz demektir.
		
		// Length () methodu Stringin icinde kac karakter oldugunu verir.
		 System.out.println(str1.length());
		 // lenght her zaman indexten bir buyuktur.
		 // cunku lenght saymaya baslar.
		 
		 // kulaniciadan ismini girmesini isteyin sonra isminin son harfini 
		 // ekrana yazdirin.
		 
		 Scanner scan = new Scanner (System.in);
		 System.out.println(" Lutfen isminizi giriniz");
		 
		 String name = scan.nextLine();
		 
		 int lenght = name.length();
		 System.out.println(name.charAt(lenght -1));
		 
		 scan.close();
	}

}
