package day33interface;

public class HondaLux extends Araba implements IcAraba, DisAraba{

	public static void main(String[] args) {
		HondaLux hondaLux = new HondaLux();
		hondaLux.benzin();
		hondaLux.direksiyon();
		hondaLux.kapi();
		hondaLux.klima();
		hondaLux.maove();
		hondaLux.far();
		hondaLux.koltuk();
		hondaLux.doseme();
		System.out.println("IcAraba Interfaceden price: " + IcAraba.price);
		System.out.println("DisAraba Interfaceden price: " + DisAraba.price);
		System.out.println(old); // tek oldugundan kullanmaya gerek yok

	}

	@Override
	public void maove() {
		System.out.println("Honda Lux: Max 200 km");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Honda Lux deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Honda Lux deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Honda Lux otomatik klima");
		
	}

	@Override
	public void kapi() {
		System.out.println("Honda Lux Parmak izli kapi");
		
	}

	@Override
	public void far() {
		System.out.println("Honda Lux Super led 2000 walt");
		
	}

}
