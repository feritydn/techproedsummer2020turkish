package day33interface;
// class ==> Interface : implements
// class ==> Class : extends 
// Interface ==> extends
public class HondaBasic extends Araba implements DisAraba,IcAraba {

	public static void main(String[] args) {
		HondaBasic hondaBasic = new HondaBasic();
		hondaBasic.diesel();
		hondaBasic.direksiyon();
		hondaBasic.kapi();
		hondaBasic.klima();
		hondaBasic.maove();
		hondaBasic.far();
		hondaBasic.koltuk();
	}
	@Override
	public void maove() {
		System.out.println("Honda Basic: Max 100 km");
	}
	@Override
	public void direksiyon() {
		System.out.println("Honda Basic suni deri direksiyon");
		
	}
	@Override
	public void koltuk() {
		System.out.println("Honda suni deri koltuk");
		
	}
	@Override
	public void klima() {
		System.out.println("Honda Basic manuel klima");
		
	}

	@Override
	public void kapi() {
		System.out.println("Honda Basic anahtarli kapi");
		
	}
	@Override
	public void far() {
		System.out.println("Honda Basic  led 1000 walt");
		
	}
}
