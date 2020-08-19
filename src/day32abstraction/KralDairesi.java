package day32abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
		KralDairesi musteri03 = new KralDairesi();
		int odaFiyati = 200;
		musteri03.kahvalti();
		System.out.println("Oda fiyati: " + odaFiyati);
		System.out.println("wifi ucreti: " + musteri03.wifi(12));
		System.out.println("Internationa Tv ucreti: " + musteri03.tv("international", 12));
		System.out.println("Toplam tutar: " + (odaFiyati + musteri03.wifi(12) +  musteri03.tv("international", 12) ));
	}
	// Herhangi bir parent tarafindan override edilen abstract method alttaki
	// concrete child’lar tarafindan override edilmese de olur
	

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz teras kat kral restuarantta.");		
	}
	public int tv (String international, int saat) {
		if(international.equals("international")) {
			return saat*5;
		}else {
			return saat*5;
		}
	}
}
