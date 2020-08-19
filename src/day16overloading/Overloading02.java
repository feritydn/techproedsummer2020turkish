package day16overloading;

public class Overloading02 {

	public static void main(String[] args) {
		

	}

	// Note : return type degistirmek overloading icin yeterli degildir.
	//        java bir methodlarin farkil olup olmadigini isim ve parametrelerden anlar.
	// Method ismi ve parametreler java icin methodlarin imzasi gibidir.
	// javada method imzasi yerine "method signature" denir.
	
	// Note2 : Access modifier degistirmek de java acisindan metmodlari farkli yapmaz
	//         cunku access modifier method signature dahil degil
	
	// Note3 : Methodlarin body sini degistrimek de methodlari java acisindan farkli kilmaz
	//         cunku bodyler method signature a dahil degildir 
	
	// Note4 : Siz daha kodu calistirmadan once java sizi uyariyorsa bu tur 
	//          hatalara "compile time error" denir  
	
	// Note 5: Kodu yazarken her hangi bir hata yok fakat kodu run yaptirdiktan sonra 
	//         console de kirmizi hata mesajlari alirsaniz bu hatalara "Run time Error" denir
	
	
	// Note 6: Overloading compile time error verir.
	
	
//	public static void carpma (int num1, int num2) {
//		System.out.println((num1*num2));
//	}
	
//	public static int carpma (int num1, int num2) {
//		return num1*num2;
//	}
	
//	public static int carpma (int num1, int num2) {
//		return num1*num2;
//	}
}
