package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		/*
	     Kullanýcýdan dikdörtgenin boyutlarýný alan ve sonra diktörtgenin alan ve 
	     cevresini hesaplayýp ekrana yazdýran bir program yazýnýz. 
	     Not: Alan: Boy x En
	     Not: Çevre: 2x (Boy + En)
        */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin en ve boyunu giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1*sayi2);
		System.out.println((sayi1+sayi2)*2);
		
		scan.close();

	}

}
