package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		// 1) baska bir classtan urettigimiz objecti yeni classta kullanabiliriz.
		// 2) objectlerin ozellilerini degistirebiliriz fakat bu degisim sadece o object ile
		//    sinirli kalir. 
		// 3) eger uretilecek her object in degsmesini istiyorsak ilk bastaki halini degistiririz.
		
		
	
		 Constructor01 hondaCar01 = new  Constructor01();
		 
		System.out.println("New price: " + ( hondaCar01.price +1000));
		System.out.println("New year: "+ (hondaCar01.year + 1));
		System.out.println("New make: "+ (hondaCar01.make.replaceAll("Honda", "Toyota")));
		System.out.println("new type: " + hondaCar01.type.replaceAll("Civic","Camry"));
		
		

	}

}
