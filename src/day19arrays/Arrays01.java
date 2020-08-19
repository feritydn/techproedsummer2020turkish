package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Integer Array  olusturalim.
		
		int arr1 [] = new int[5];
		
		System.out.println(arr1[1]);
		//Arrayin  indexi 1 olan elemanini ekrana yazdirir.
		
		// Char array olusturalim
//		char arr2[]= new char [3];
//		System.out.println(arr2);
		// arrayin ismini kullanarak yazdirirsak referenceyi verir.
	
		arr1[0] = 12;
		System.out.println(arr1[0]);
		arr1[1] =13;
		System.out.println(arr1[1]);
		arr1[2] =14;
		System.out.println(arr1[2]);
		arr1[3] =15;
		System.out.println(arr1[3]);
		arr1[4] = 22;
		System.out.println(arr1[4]);
		
		// Array deki elemanlari ekrana yazdirmak icin for dongusunu kullaniniz.
		
		for (int i=0; i<=4; i++) {
			System.out.println(arr1[i]);
			
		}
		
		// Array de olmayan indexe deger atamasi yapilirsa run time error alinir.
		// Arrayda olmayan indexi kullanmaya calisirsak "ArrayIndexOutOfBoundsException"
		
		
//		arr1[5] = 23;
// 		System.out.println(arr1[5]);
	}

}
