package day16overloading;

public class Constructor03 {
	
	String isim = "Ali Can";
	int yas = 33;
	int kilo = 85;
	String meslek = "Automation Tester";
	boolean emekli = false;
		// Constructor icine sadece yazacagimiz degerleri yerlestiriyoruz.
	Constructor03(){
		
		
	}
	
	Constructor03(String isim, int yas, boolean emekli){
		this.isim=isim;
		this.yas = yas;
		this.emekli= emekli;
	
	}
	
	Constructor03(String isim){
		this.isim=isim;
	
	}

	public static void main(String[] args) {
		
		Constructor03 insan01 = new Constructor03();
		System.out.println(insan01.isim);
		System.out.println(insan01.yas);
		System.out.println(insan01.kilo);
		System.out.println(insan01.meslek);
		System.out.println(insan01.emekli);
		
		Constructor03 insan02 = new Constructor03("Ayhan yildiz", 56, true);
		System.out.println(insan02.isim);
		System.out.println(insan02.yas);
		System.out.println(insan02.emekli);
		System.out.println(insan02.meslek);
		
		Constructor03 insan03 = new Constructor03("Ayse yildiz");
		System.out.println(insan03.isim);
	
	}

}
