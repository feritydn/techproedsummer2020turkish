package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview01 {

	public static void main(String[] args) {
		//Kullanicidan bir String alin ve bu Stringi ekrana tersten yazdirin.
		// Interview e giderken bu soruyu bilmeden gitmeyin
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir cumle veya kelime giriniz");
		
		String str = scan.nextLine();
		
	for (int i = str.length()-1; i >=0; i-- ) {
			
			System.out.print(str.charAt(i)); // naC ilA
			
		}
		
	scan.close();
	}

}
