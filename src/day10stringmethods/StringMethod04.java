package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains ( ) methodu bir Stringin icinde bir Characterin olup 
		// olmadigini kontrol eder eger varsa true yoksa false return eder.
		
		String str1 = "karakartal";
		System.out.println(str1.contains("m")); // tek harf bile olsa String yapmaliyiz.
		System.out.println(str1.contains("kar"));
		
		
		// trim () methodu bir Stringin bas ve sonundaki bosluklari siler.
		// " Ali " ==> "Ali"
		// ortdaaki bosluklari silmez
		
		String str2 = " Ali Can      ";
		System.out.println("trim kullanmadan once:" + str2);
		System.out.println("trim kullanmadan once:" + str2.trim());
		
		// isEmpty ( ) methodu bir string characer olup olmadigini kontrol eder
		// varsa false yoksa true der.
		
		String str3 = "Ali";
		System.out.println(str3.isEmpty());
		
		String str4 = "";
		System.out.println(str4.isEmpty());
		// isEmpty true cikarsa lenght 0 demektir.
				
	}

}
