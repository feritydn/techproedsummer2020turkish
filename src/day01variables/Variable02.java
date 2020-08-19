package day01variables;

public class Variable02 {

	public static void main(String[] args) {
		
		char harf1 = 'a'; //97 deger
		char harf2 = 'b'; //98 deger

		System.out.println(harf1 + harf2);  // syso ctrl+space kisa yol 
		System.out.println(harf1); // a
		System.out.println(harf2); // b
		
		// ab yazmak icin asagidaki yontem kullanilir.
		System.out.print(harf1);
		System.out.println(harf2);
		
		// bir char'in sayi degeri ASCII tablosu kullanmadan nasil bulunur?
		int aCharDeger = 'a';
		System.out.println(aCharDeger);
		// data tybe'i int olan bir variable olustur ve char'i bu variable ata
		
		// ! % * sayi degerleri kac?
		int unlemCharDeger = '!';
		int yuzdeCharDeger = '%';
		int asteriksCharDeger = '*';
		
		System.out.println(unlemCharDeger);
		System.out.println(yuzdeCharDeger);
		System.out.println(asteriksCharDeger);
		
	}

}
