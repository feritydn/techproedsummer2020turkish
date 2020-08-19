package day32abstraction;

public class TekKisilikOda extends Otel{

	public static void main(String[] args) {
		
		int odaFiyati = 50;
		TekKisilikOda musteri01 = new TekKisilikOda();
		musteri01.kahvalti();
		System.out.println("Oda fiyati: " + odaFiyati);
		System.out.println("tv ucreti: " + musteri01.tv(5));
		System.out.println("wifi ucreti: " + musteri01.wifi(1));
		System.out.println("Toplam tutar: " + (odaFiyati + musteri01.wifi(1) +  musteri01.tv(5) ));
	}

	@Override
	public void kahvalti() {
		System.out.println("kahvaltiniz sandvic olarak gelecek");		
	}

	public int tv(int saat) {
		return saat*2;
	}
}
