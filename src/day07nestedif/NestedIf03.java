package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		// kullanicidan yil girmesini isteyin
		// girilen yil artik yil ise ekrana artik yil yazdirin
		// artik yil degil ise artik yil degil yazdirin.
		
		// Artik yil 1) yil 100 e bolunurse 400 e bolunmeli ==> 1300 artik degil
		//                                                    ==> 1200 artik yil
		//           2) yil 100 e bolunmezse 4 e bolunmeli  
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Yil giriniz");
		
		int year = scan.nextInt();
		
		if(year %100 == 0  ) {
			if (year %400 == 0) {
				System.out.println("Artik yil");
			} else {
				System.out.println("Artik yil degil");
			}
			
		}else if(year %100 !=0 ) {
			
			if(year %4 == 0) {
				System.out.println("Artik yil");
			}
		}else {
			System.out.println("Artik yil degil");
		} scan.close();
	} 

}
