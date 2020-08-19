package day19arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// elemanlari 1, 2 , 3 , 4 , 5 olan bir integer array olusturunuz.
		// bu array'de 3 elemaninin olup olmadigini kontrol ediniz.
		// 3 vara ekrana "3 var" yazdirin yoksa "3 yok" yazdirin
		// kac tane 3 oldugunu da yazdirin.
		
		// 1.yol ==> Array olusrurup eleman eklemek icin
//		int arr [] = new int [5];
//		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;

		// 2.yol ==> Array olusrurup eleman eklemek icin
		
		int arr[] = {1, 2, 3, 4, 5};
		
		int count = 0;	// flag (bayrak) cok onemli ve cok kullanacagiz.		
		
		for (int i=0 ; i<5; i++  ) {
			
			if(arr[i]==3) {
				count++;	
			}	
			
		}
		if (count >0) {
			System.out.println(count + " tane 3 var");
		}else {
			System.out.println("3 yok");
		}
		
		
		
		
		
		
		
		
		
	}

}
