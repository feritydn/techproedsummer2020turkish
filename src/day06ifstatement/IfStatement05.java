package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {


		// kulalnicidan bir dikdortgenin en ve boyunu alin
		// en ve boy esit ise ekrana bu bir karedir yazdirin
		// esit degil ise bu bir dikdortgendir yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen en ve boy giriniz");
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		// uzun yol
		if (en == boy) {
			System.out.println("Bu bir karedir");
		}
		
		if(en != boy) {
			System.out.println(" Bu bir dikdortgendir");
		}
		 //Kisa yol 
		 // else ==> diger ihtimallerin tamami
		// en ile boy ya esittier ya da degildir
		
		if (en == boy) {
			System.out.println("bu bir karedir");
		}else {
			System.out.println("Bu bir dikdortgendir");
		}
		
		scan.close();

	}

}
