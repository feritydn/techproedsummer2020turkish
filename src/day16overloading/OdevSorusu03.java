package day16overloading;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		//Kullan�c�ya paralelkenar, dikd�rtgen ve ��gen 
		//kelimelerinden birini ve iki say� se�mesini s�yleyin.
		// Hangi �ekli se�erse, o �eklin alan�n� ve �evresini 
		//ekrana yazd�ran program� yaz�n�z.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("paralelkenar, dikdortgen ve ucgen kelimelerinden birini giriniz ");
		String sekilIsmi = scan.next().toLowerCase();
		System.out.println("iki sayi giriniz");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		alanVeCevre(sekilIsmi,  num1,  num2);
		scan.close();
	}
	
	public static void alanVeCevre(String sekilIsmi, int num1, int num2) {
		switch(sekilIsmi) {
		case "paralelkenar":
			System.out.println("alan = " + num1*num2);
			System.out.println("Cevre = " + (num1+num2)*2);
			break;
		case "dikdortgen":
			System.out.println("alan = " + num1*num2);
			System.out.println("Cevre = " + (num1+num2)*2);
			break;
		case "ucgen":
			System.out.println("alan = " + (num1*num2)/2);
			break;
		default:
			System.out.println("Yanlis sekil ismi giridiniz");
		}
		
	}
}
