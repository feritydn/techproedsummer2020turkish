package day01variables;

public class Variable01 {

	public static void main(String[]args) {
		
		int maas = 3000;
		                            // cahr icin tek tirnak kullanilir.
		char harf = 'S';           // default value karakterler icin \0000
		
		
		System.out.println(maas);  // maas degil deger gozukur
		
		System.out.println(harf);  // deger degisince sonuc degisir
		
		int sayi=123;
		System.out.println(sayi);
		
		boolean isOld= true;       // boolean lar icin sadece True yada False kullanilir
		System.out.println(isOld);
		
		boolean isNew= false;
		System.out.println(isNew);
		
		byte derinlik=-128;
		System.out.println(derinlik); //-128 den 127 e kadar 8 bit yer kaplar
		
		short naziliNufus= 2800;     // -32 bin kusur + 32 bin kusur
		System.out.println(naziliNufus);
		
		long hucreSayisi=4586666654566666l;   // java sayisiyi int olarak
		                                      //tutmak istiyor sonuna 'l' veya 'L' yazalim.
		System.out.println(hucreSayisi);
		
		double pi=3.1444423589617;            // java butun ondalik sayilari
		                                      // otomotik olarak double kabul eder
		System.out.println(pi);               // default value 0.0
        
		
		float para=5.25f;                   // eger bir ondalik kesri float yapmak istersek sonuna 
		                                    // 'f' veya 'F' yazilir.
		System.out.println(para);           // default value 0.0f
		
		String ogrenciIsmi= "Ali Can";
		System.out.println(ogrenciIsmi);    // ""kullanmayi unutma
		
		
	}
}
