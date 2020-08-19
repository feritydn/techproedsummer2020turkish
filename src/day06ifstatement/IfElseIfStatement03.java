package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		
	     //Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir
        //Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan bir 
        //jackpot oyunu icin program yaziniz.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen alti basamakli bir sayi giriniz.0basta kullanilabilir");
		
		int num = scan.nextInt();
		
		if (num < 200000) {
			System.out.println("kazandiniz");
			
		}else if (num<500000) {
			System.out.println("tekrar deneyin");
		}else {
			System.out.println("kaybettiniz");
		}
		scan.close();

	}

}
