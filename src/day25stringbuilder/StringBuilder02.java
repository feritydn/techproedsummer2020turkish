package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		
		
		// Substring () methodu atama yapmadan stringi degistirmez.
		
		StringBuilder str1 =  new StringBuilder("animals");
		
		// 1.yol
		String str2 = str1.substring(3);	// String clasinin methodu StringBuilder sadece kullaniyor
											// str1 String degil StringBuilder oldugundan atama yapaamyiz.
		
		System.out.println(str2);

		// 2. yol
		
		System.out.println(str1.substring(3));
		
		String str3 = str1.substring(1, 4);
		
		System.out.println(str3);
		
		
		// IndexOf() methodu ; belli bir karakterin indexini return edder
		
		System.out.println(str1.indexOf("m")); // 3
		
		// lenght() methodu string classindan gelir ve uzunlugunu return eder
		
		System.out.println(str1.length()); // 7
		
		// CharAt () belli bir indexteki karakteri return eder
		
		System.out.println(str1.charAt(5)); // l
		
		// insert() methodu istenen index'e istenen karakteri eklemeye yarar
		// insert () methodu append gibi StringBuilder i direkt degistirir.
		
		str1.insert(0, "X");
		System.out.println(str1);
		
		// delete(); istenen index araligindaki karakterleri siler
		
		str1.delete(0, 1);
		System.out.println(str1);
		
		//deleteCharAt (); istenen indexteki chareacteri siler
		
		str1.deleteCharAt(6); // animals == s harfi silinir
		System.out.println(str1);
		
		// reverse () methodu Stringi tersten yazdirir
		
		str1.reverse();
		System.out.println(str1);
		
		// toString () methodu StringBuilder i Stringe cevirmek icin kullanilir.
		
		str1.toString();
		System.out.println(str1);	
	}

}
