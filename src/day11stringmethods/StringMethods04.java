package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {
		
		// valueOf () rakamlarla olusturulan Stringleri sayiya donustur
		// boylece rakamlarla olustrurlan Stringlerle matematiksel islemler yapmamizi saglar.
		
		// valueOf hem Integer wreapper classinin icinde hem de Stringin icinde var.
		// Integer wrapper classinin icinde olan valueOf methodu Stringi Integer a cevirir.
		// Stringin icindeki valoeOf methodu Integeri Stringe cevirir.
		
		String paraErkek = "1900";
		
		String paraKadin = "2000";
		
		// Bu ailenin toplam gelirirni bulunuz.
		
		System.out.println(paraErkek + paraKadin); // bu toplama yapmaz.
		
		System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKadin));
		
		int maasErkek = 1900;
		int maaskadin = 2000;
		
		// maasErkek ve maasKadin sayilarini Stringe donusturun ve concatination yapiniz.
		
		System.out.println(String.valueOf(maasErkek)+ " "+ String.valueOf(maaskadin));

	}

}
