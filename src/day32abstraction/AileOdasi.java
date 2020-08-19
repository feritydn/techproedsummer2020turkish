package day32abstraction;

public class AileOdasi extends Otel {

	public static void main(String[] args) {
		AileOdasi musteri02 = new AileOdasi();
		musteri02.kahvalti();
		int odaFiyati = 100;
		System.out.println("wifi ucreti: " + musteri02.wifi(6));
		System.out.println("Oda fiyati: " + odaFiyati);
		System.out.println("Toplam tutar: " + (odaFiyati + musteri02.wifi(6)));
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz kafeteryada olacaktir");
		
	}
	
}
