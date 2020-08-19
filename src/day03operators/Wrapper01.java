package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		// kullanicidan ad ve soyadini alip ekrana yazdiran bir program yaziniz.
		// (String kullaniniz)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");	
		
		String isim = scan.nextLine(); // String almak icin ya sadece next() yada nextLIne() kullaniriz.
                                       // next tek kelime icin nextline girilen tum stringi alir.
		System.out.println(isim);      // next methodu boslugu gordugu anda birakir.
		
		scan.close();

		
	}

}
