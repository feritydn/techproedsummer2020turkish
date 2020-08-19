package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir integer Arrayin elemanlarini kucukten buyuge diziniz ve ekrana 
		// iki durumu da yazdiriniz.
		
		int arr [] = {2, 11, 0, 23, 7};
		
		// Assending order ve natural order
		
		System.out.println("Sralamadan once: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr));

		
		// Soru : Char'lardan olusan bir array olusturun ve "ascending order" yapiniz.
		
		char arr1[] = {'f','e', 'r','i', 't'};
		System.out.println("Sralamadan once: " + Arrays.toString(arr1));
		Arrays.parallelSort(arr1);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr1));
		// charlar siralanirken java buyuk harfleri basa alir cunku ascii kodlari kullanir.

		// Soru : Stringlerden olusan bir array olusturun ve ascending order yapin.
		
		String arr2 []= {"Ankara", "Roma", "New York","Istanbul" };
		System.out.println("Sralamadan once: " + Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr2));
		// Stringleri buyukten kucuge dogru alfabetik siralama yapar.
		
		// Soru: boolean bir array olusturun ve ascendig order olusturun.
//		Arrays.sort
//		boolean arr3 [] = {true, false, false};
//		System.out.println("Sralamadan once: " + Arrays.toString(arr3));
//		Arrays.sort(arr3);
//		System.out.println("Siralamadan sonra: " + Arrays.toString(arr3));
		// Boolean icin sort kullanilamaz.
		
	}

}
