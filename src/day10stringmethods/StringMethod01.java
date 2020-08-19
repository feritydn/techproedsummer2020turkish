package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		
		// indexOf () methodu Stringin icindeki karakterin yerinin
		// belirlemek icin kullanilir.
		
		// indexOf( ) methodu 1. versiyonu
		String str1 = "Javva World";
		
		System.out.println(str1.indexOf('v'));
			// Ekrana 2 verir cunku index sayima 0 dan baslar
		
		System.out.println(str1.indexOf('W'));
			// ekrana bes yazdirir cunku bosluk bir karakterdir.
		
		System.out.println(str1.indexOf('w')); 
			// Java index bulamaz cunku java case sensetivedir.
			// java indexte olmayan bir karakter icin bize -1 return eder.
		
		System.out.println(str1.indexOf('a'));
			// iki tane a var ilk olani bulur. ve devam etmez.
			// Soldan saga calisir.
		
		
		// indexOf() methodu 2. versiyonu
		
		System.out.println(str1.indexOf('a',3)); 
			// Stringteki ikinci a characterinin indexini bulsun
			// 3 v harfinin indexi 3 ondan sonra a bul demek
			// 3 ten sonra arastirmiyor 3 dahil arastiriyor.

		System.out.println(str1.indexOf('a',4));
		System.out.println(str1.indexOf('a',1)); // 1 yazdirir.
		System.out.println(str1.indexOf('a',5)); 
			// -1 yazdirir. cunku stringte a olmasina ragmen bizim aradigimiz yerde yok
		
		// "Alamanya" Stringidenki ikinci 'a' character inin indexini bulunuz.
		
		String str2 = "Alamanya"; 
		
		System.out.println(str2.indexOf('a'));
		int idx = str2.indexOf('a');
		
		System.out.println (str2.indexOf('a', idx+1));
		
		// indexOf ( ) methodunun 3. versiyonu
		
		String str3 = "Missisippi"; 
		
		System.out.println(str3.indexOf("is"));
			// "is" ilk olanin ve ilk olanin da ilk harfinin indexini return eder
			// Bu ornekte ilk is teki i harfinin indexi olan 1 i return eder.
		System.out.println(str3.indexOf("si"));
			// ekrana uc yazdirir
		
		
		
	}

}
