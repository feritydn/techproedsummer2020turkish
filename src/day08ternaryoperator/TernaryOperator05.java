package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		
		// Kullanicidan bir character girmesini isteyiniz
		// Character harf ise kucuk harf olup olmadigini kontrol ediniz
		// Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
		// Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
		// Harf degilse ekrana "Harf degil" yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz");
		
		char ch = scan.next().charAt(0);
		
		String result = ((ch <= 'z' && ch>='a') ||(ch >='A' && ch<='Z')) ? 
				        (ch <= 'A' && ch>='Z')? "kucuk harf" : "BUYUK HARF" : "Harf Degil";
		System.out.println(result);
		
	scan.close();
		
		

	}

}
