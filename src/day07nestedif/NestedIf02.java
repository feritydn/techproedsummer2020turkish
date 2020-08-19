package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {

		// 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen passwordu giriniz");
		
		int num = scan.nextInt();
		
		if (num >999 && num<10000) {
			if (num %2 ==0) {
				System.out.println("Password Dogru");
			}else if (num %2!=0) {
				System.out.println("Password yanlis");
			}
		}else {
			System.out.println("Tekrar deneyin");
		}
		scan.close();
	}
	

}
