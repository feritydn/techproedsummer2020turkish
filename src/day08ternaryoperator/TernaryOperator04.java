package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {

		             // Ternary Operator (If else If)
		
		// kullanicidan bir sayi aliniz.
	   // sayi 0 dan buyuk esitse 10 dan kucuk olup olmadigini kontrol ediniz.
	  // ekrana rakam yazdiriniz degilse pozitif sayi yazdiriniz
	   // 	sayi siifrdan kucuk ise negatif sayi yazdiriniz.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir tamsayi giriniz");
		int num = scan.nextInt();
		
	String result =	num >=0 ?(num<10 ?"Rakam" : "Pozitif Sayi") : "Negatif sayi";
			System.out.println( num + " " + result);	
			
			scan.close();
	}

}
