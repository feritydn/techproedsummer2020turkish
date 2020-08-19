package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		// concat ( ) method concatenation yapmanin 
		// yani iki Stringi birlestirmenin diger yontemidir.
		
		String str1 = "Ali";
		
		String str2 = "Veli";
		
		// normelade 
		System.out.println(str1 + str2); //AliVeli
		
		System.out.println(str1.concat(str2));//AliVeli
		
		System.out.println(str1.concat(str2).concat(str1));
			// concant i istedigimiz kadar pes pese kullanabiliriz.
		
		System.out.println(str1.concat("==> ").concat(str2));

		
		// replace () methodu bir characterin butun gorunumlerinin yerine 
		//baska bir character yazdirmaya yarar or: ata ==>ana
		
		// replace 1. versiyon
		String str3 = "ata";
		
		System.out.println(str3.replace("t","n")); // ana 
		
		System.out.println(str3.replace("a","u"));
			// karakterin tamamini bulup degistiriyor.
		System.out.println(str3.replace("a","o"));
		
		System.out.println(str3.replace("x","y"));
			// ata verir degisiklik yok. x harfi olmadigi icin herhangi bir degisim olmaz.
		System.out.println(str3.replace("","/"));
			// iki tirnak arasinda hicbir sey ve / yazarsak butun harfleri / ile ayirir.
		
		System.out.println(str3.replace("t",""));
			// t imha olacak.
		
		System.out.println(str3.replace("at","Mustaf"));
		
		// replaceFirst () methodu degistirmek istedigimiz 
		// characterin sadece ilk gorunumunu degistirir.
		
		String str4 = "karakartal";
		
		System.out.println(str4.replaceFirst("k", "K")); // Karakartal
		
		System.out.println(str4.replaceFirst("a", "e")); // kerakartal
		
		System.out.println(str4.replaceFirst("ka", "A")); // Arakartal
		
		System.out.println(str4.replaceFirst("kar", "")); // akartal
		
		System.out.println(str4.replaceFirst("kara", "A"));
		
		System.out.println(str4.replaceFirst("karakartal", "cimbombom"));
		
		// Soru
		String text = "Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu. ";
		System.out.println(text.replace("Ali", "Veli"));
		
		// replaceAll() ve replace ( ) methodu tamamiyla ayni seyi yapar.
		// replace() methodunda isterseniz tek harfli karakterler icin
		// tek tirnak kulanabilirsiniz. fakat replaceAll da tek tirnak kullanamayiz.
		
	}

}
