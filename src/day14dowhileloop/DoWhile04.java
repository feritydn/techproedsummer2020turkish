package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// Kullaniciadan bir String alin 
		// Bu Stringin indexi tek sayi olan karakterlerini ekrana yazdirin.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen bir cumle ya da kelime giriniz. Bir harften fazla olsun");
		
		String str = scan.nextLine();
		
		int lenght = str.length();
		int i =0;
		
	do {
		if (i%2 ==1) {
			System.out.print(str.charAt(i)+ " ");
			
		}
		i++;
	}while(i<lenght);
	
	scan.close();
	}

}
