package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[]args) {
		
		// kullanicidan bir tam sayi isteyin ve bu tam sayinin
		// mutlak degerini ekrana yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		if(sayi>= 0) {
			System.out.println(sayi * (+1));
		}else {
			System.out.println(sayi* -1);
		}
		
		scan.close();

	}
}
