package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {

		
		// kullanicidan alacagi urun miktarini ve fiyatini alalim.
		// eger kullanici 1000 den fazla urun alirsa %20
		// indirim yapan ve kullanicinin odeyecegi toplam miktari yazan 
		//bir kod yaziniz. 1000 den az veya 1000 urun alirsa 
		// indirim yapmayin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" lutfen alacaginiz urun adedini giriniz");
		
		double num = scan.nextDouble();
		
		System.out.println("Lutfen birim fiyatini giriniz");
		
		double fiyat = scan.nextDouble();
		
		
		if(num >1000) {
			
			System.out.println((fiyat*80/100)* num);
			
		}else {
			System.out.println(fiyat*num);
		}
		
		scan.close();

	}

}
