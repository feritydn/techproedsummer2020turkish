package day07nestedif;

import java.util.Scanner;

public class OdevSesliHarfSorusu {

	public static void main(String[] args) {

		//Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
		//�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a, e, i, o, u,b, c, d, f harflerinden birini giriniz");
	
		char harf = scan.next().charAt(0);
		
		if (harf =='a'||harf =='e'||harf =='i'||harf =='o'||harf =='u') {
			System.out.println(harf + " sesli harf");
			
		}else if (harf =='b'||harf =='c'||harf =='d'||harf =='f') {
			
			System.out.println(harf + " sessiz harf");
		}else {
			System.out.println("yanlis harf girdiniz");
		}
		
		scan.close();

	}

}
