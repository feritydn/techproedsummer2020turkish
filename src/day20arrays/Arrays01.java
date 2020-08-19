package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		// Kullan�c�dan ka� elemanl� bir array girmesini  isteyin.
		// Bu array�in tum elemanlar�n� ekrana yazd�r�n.
		// Bu aray�n ilk eleman�n� son eleman yap�n ve tum elemanlar�n� ekrana yazd�r�n.
		// Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazd�r�n.
	
		Scanner scan = new Scanner (System.in);
	
		System.out.println("Kac elemanli bir int array olusturmak istersiniz");
		int lenght = scan.nextInt();
	
		int arr[] = new int [lenght];
				
		System.out.println("array elemanlarini giriniz");
	
		for (int i=0; i<lenght; i++) {
			arr [i] = scan.nextInt();
			
		}
		
		// Arrays.toString(arrayismi) methodunu arrayin tum elemanlarini ekranda gormemizi saglar.
		System.out.println(Arrays.toString(arr));
		
		int arrSon [] = new int[lenght];
		
		for (int i =1; i<lenght; i++) {
			arrSon[i-1] = arr[i];
			
		}
		arrSon[lenght -1] = arr[0]; 
		System.out.println(Arrays.toString(arrSon));
		
		scan.close();
		
		
		
	}

}
