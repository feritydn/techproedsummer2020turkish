package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
		// baþlayýp bitiþ deðerinde veya öncesinde  biten tüm 3 ile bölünebilen tamsayýlarý ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);
		

		System.out.println("Lutfen baslangic degerini giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bitis degerini giriniz");
		
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("baslangic degeri kucuk olmalidir");
			
		}else {
			for (int i = num1 ; i<=num2 ; i = i+1) {
				if (i %3 ==0) {
					System.out.println(i);
					
				}
			}
			
		}
		scan.close();
	}

}
