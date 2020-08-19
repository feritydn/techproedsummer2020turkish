package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// iki array olusturup bu arraylarin bir birine esit olup olmadigini
		// kontrol ediniz.
		
		// Not: Iki arrayin esit olabilmesi icin; 
		//       1) elemanlar ayni olmali
		//       2) esit elemanlarin index numaralari da ayni olamli  

		int arr1 [] = {1, 2 , 3};
		int arr2 [] = {1, 2 , 3};
		
		System.out.println(arr1 == arr2); // false cunku reference farkli
		      // "==" refernceleri de kontrol eder. Bu iki array farkli iki object olduklarindan reference leri farklidir.
		
		System.out.println(Arrays.equals(arr1, arr2)); 
		// Arrays methodunun icinden bakmamiz lazim.
		// Arrays.equals() sedece deger ve indexlere bakar reference lere bakmaz.
		
		
	}

}
