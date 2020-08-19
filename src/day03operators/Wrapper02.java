package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		// kullanicidan ilk isinmin ve soy isimini alin ve alt alta yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen adinizi yaziniz");
		
		String isim = scan.nextLine();
		
		
		System.out.println("Lutfen soyisminiz yaziniz");
		
		String soyisim= scan.nextLine();
		
		System.out.println(isim);
		System.out.println(soyisim);
		
		
		scan.close();

		
	}

}
