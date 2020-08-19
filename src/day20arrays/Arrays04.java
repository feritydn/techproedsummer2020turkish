package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Bir arrayin icinde belli bir elemanin var olup olmadigini 
		// kontrol ediniz.
		// binarySearch() methodu bu is icin kullanilir.
		// ONEMLI NOT: binarySearch() methodunu kullanmadan once sort methodunun
		// kullanmak zorundayiz aksi takdirde dogru sonuc vermeyebilir.
		
		// Binary search aranan eleman var oldugunda o elemanin indexini return eder.
		// olmayan eleman varsa negatif sayi verir.
		
		int arr [] = {1, 5, 2, 4, 3};
		
		// yukarida verilen array da 3 eleman olarak var mi?
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3)); // indexini verecek varsa
		
		// Ayni elemandan birden fazla oldugundan ilkinin indexini verir.
		System.out.println(Arrays.binarySearch(arr, 100));
		//binarySearch () olamayn sayilar icin negatif sayi return eder.
		// lenght sayisina gore - sayi veriri.
		
	}

}
