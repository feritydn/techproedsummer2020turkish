package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// Kullanicianin girdigi sayi icin carpim tablosu
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int num = scan.nextInt();
		
		System.out.println("for loop ile cozumu");
		
		for (int i =1; i<11; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
		}
				
		System.out.println("While loop ile cozumu");
		
		int num1 = 1;
		while (num1<11) {
			System.out.println(num + "x" + num1 + "=" + (num*num1));
			num1++;
		}
		scan.close();
	}

}
