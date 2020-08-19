package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		
		// substring () methodu bir Stringin belli bir bolumunu kesip 
		//almak icin kullanilir.
		
		String str1 = "Java calisana kolaydir";
		
		// subsitring () 1. versiyon
		System.out.println(str1.substring(5));
			// 5 indexi gosterir. Length degil. Bes kesilen kisma dahil.
		System.out.println(str1.substring(8));
			// isana kolaydir (Inclusive)
		System.out.println(str1.substring(22));
			// hicbir sey verir cunku index 21 de biter.
		System.out.println(str1.substring(20));
			// index 23 yok ama ben 23 ten kesmek istiyorum bu bir hatadir.
		
		System.out.println(str1.substring(0));
			// kullanmak cok mantikli degil cunku str1 ile ayni
		
		// substring 2. versiyon
		
		System.out.println(str1.substring(5,13));
			// bitiris icin bir sonrasini diyoruz.
			// ilk index dahil ikinci index dahil degildir.[5,13)
		System.out.println(str1.substring(6,12));
		System.out.println(str1.substring(6,6));
			// ekranda hicbir sey goremeyiz
		System.out.println(str1.substring(3,6));
		 // ilk rakami buyuk yazarsak exception verir.
	}

}
