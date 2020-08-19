package day17constructors;

public class Constructors02 {

	// Buyume methodu bu class da degil Constructors01 Classinda
	// o yuzden java kullanmama musaade etmiyor. 
	
	// Eger siz baska bir class daki methodu kullanmak istiyorsaniz
	// o classtan bir tane obje olusturup o obje sayesinde istediginiz
	// methodu kullanabilirsiniz.
	// reuseblity konusunda bu cok onemli.
	public static void main(String[] args) {
		Constructors01 obj1 = new Constructors01();
		//obj1.buyume(33);
		//obj1.isimDegistir("Kemal Can");
		
		// buyume() methodu static oldugundan java obje kullanarak 
		// buyume methodunu cagirmamizi istemez ve code nin altini 
		// sari renkte cizer. Sari renk su demek begenmedim ama
		// calisir.
		Constructors01.buyume(33);
		Constructors01.isimDegistir("Kemal Can");
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		// bir variable veya method static olarak olusturulmussa
		// o variable veya methoda object olustrumadan sadece class
		// ismini kullanarak ulasabiliriz.
		System.out.println(Constructors03.surname);
		System.out.println(Constructors03.kilo);
		Constructors03.artirma(45);
		Constructors03.nameDegistir("Bolat");
	}

}
