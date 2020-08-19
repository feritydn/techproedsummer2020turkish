package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {

		// kullanicidan yil girmesini isteyin
		// girilen yil artik yil ise ekrana artik yil yazdirin
		// artik yil degil ise artik yil degil yazdirin.
		
		// Artik yil 1) yil 100 e bolunurse 400 e bolunmeli ==> 1300 artik degil
		//                                                    ==> 1200 artik yil
		//           2) yil 100 e bolunmezse 4 e bolunmeli  
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir yil giriniz");
		
		int yil = scan.nextInt();
		
		if (yil %100 ==0 && yil %400 == 0) {
			System.out.println(yil + " artik yil");
			
		}else if(yil %100 !=0 && yil %4 ==0) {
			System.out.println(yil + " artik yildir");
		}else {
			System.out.println(yil + " artik yil degildir");
		}
		
		scan.close();

	}

}
