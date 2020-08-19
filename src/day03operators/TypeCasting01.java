package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by1 = 101;
		int sayi1 = by1; // kucuk data tipini buyuk data tipine cevirmek
		               // icin ekstra bir kod yazmaya gerek yok. java bunu
		               // otomotik olarak yapar (Auto widening)
		
		System.out.println(sayi1);
		
		int sayi2 = 53;            // buyuk data tipini kucuk data tipine cevirmek java tarafindan yapilmaz
		byte by2 = (byte)sayi2;    // ornekteki gibi sag tarafa donusturmek istedigimiz data tipini
		System.out.println(by2);   // parantez icinde yazmaliyiz.

		double sayi3 = 23.9;
		int by3 = (int) sayi3;
		System.out.println(by3);
		
		float sayi4 = -23.9F;
		short by4 = (short) sayi4;
		System.out.println(by4);
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		double sonuc1 = sayi5/sayi6;
		System.out.println(sonuc1);
		
		int sonuc2 = (int) (sayi5/sayi6);
		System.out.println(sonuc2);
		
		int sayi7 = 5;
		int sayi8 = 3;
		
		int sonuc3 = sayi7/sayi8;
		System.out.println(sonuc3);  // normalde sonuc 1.6666666 ama data type int olunca sadece tam sayi gorulur.
		
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;  // neden sonuc -1
		System.out.println(by5);  // normalde byte ta 256 sayi var biz 255  
		
		
	}

}
