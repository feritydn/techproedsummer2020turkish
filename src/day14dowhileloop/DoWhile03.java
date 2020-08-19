package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {
	
	public static void main(String[] args) {
		// Kullanicidan Sayi alin
		// sayi 10 dan kucuk ise ekrana "Kazandiniz" yazdirin.
		// sayi 10 veya 10dan buyukse ekrana "Bir tamsayi giriniz" yazdirin.
		
		Scanner scan = new Scanner (System.in);
		int num=0;
		
		do {
		System.out.println("Bir tamsayi giriniz");
		
		num= scan.nextInt();
		
		}while(num>=10);
		
		System.out.println("Kazandiniz");
		scan.close();
	}

}
