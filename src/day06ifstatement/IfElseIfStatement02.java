package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		//Kullanicidan sinav notunu tamsayi olarak girmesini isteyin
		//Negatif girerse ekrana "Yanlis deger girdiniz" yazdirin
		//0 dan buyuk ve esit 50 den kucuk girerse ekrana "kaldiniz" yazdirin
		//50 den buyuk ve esit 80 den kucuk ise ekrana "Gectiniz" yazdirin
		//80 den buyuk ve esit 100 den kucuk ise ekrana "Tebrikler" yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz");
		int not = scan.nextInt();
		
		if(not<0) {
			System.out.println("Negatif deger giremezsiniz");
		} else if(not<50) {
			System.out.println("kaldiniz");
		}else if (not <= 80) {
			System.out.println("gectiniz");
		}else if (not <=100) {
			System.out.println("tebrikler");
		} else {
			System.out.println("100 den buyuk deger giremezsiniz");
		}
		scan.close();

	}

}
