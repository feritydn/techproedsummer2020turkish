package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		// kullanici iki tam sayi versin program bu tam sayilarinin toplamini ve carpimini
		//ekrana yazdirsin
		
		Scanner scan = new Scanner(System.in);               // kirmizi cizgi cikacak
		System.out.println("Lutfen iki tam sayi giriniz.");  // import etmemiz lazim

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);
		
		
		
		scan.close();
		

	}

}
