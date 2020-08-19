package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		// kullanici karenin bir kenar uzunlugunu girsin biz karenin cevresini ve alanini ekrana yazdiralim.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz.");
		
		int kenarUzunlugu = scan.nextInt();
		
		System.out.println(kenarUzunlugu + kenarUzunlugu +kenarUzunlugu +kenarUzunlugu);

		System.out.println(kenarUzunlugu * kenarUzunlugu);
		
		scan.close();
	}

}
