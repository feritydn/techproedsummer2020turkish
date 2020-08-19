package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview02 {
	
	public static void main(String[] args) {
		//Kullanicidan bir String alin ve bu Stringi ekrana tersten yazdirin.
		// Interview e giderken bu soruyu bilmeden gitmeyin
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir cumle veya kelime giriniz");
		
		String str = scan.nextLine();
	
	
	int lenght = str.length()-1;
	
	while (lenght >=0) {
		System.out.print(str.charAt(lenght));
		
		lenght--;
	}
	scan.close();

	}
}
