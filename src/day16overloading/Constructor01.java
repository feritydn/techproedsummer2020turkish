package day16overloading;

public class Constructor01 {
	
	
	int price = 20000;
	int year = 2020;
	String make = "Honda";
	String type = "Civic";

	public static void main(String[] args) {
		// Class i kullanip object yapan seye constructor denir.
		// muteahit
		// consrtroctor is not a method, is not a variable ise a code block to
		// create objects from a class.
		
		// 1 ) Constructor is inside the class
		// 2) constructor has the same name with the class
		// 3) Constructor has no return type
		
		// Class olusturdugumuzda java classla bereber bir constructor olusturur
		// Biz onu herhangi bir code yazmadan direkt kullanabiliriz. Bu constructor a
		// default constructor denir. Bu default constructorlarda parametre olmaz.
		// Default constructor class olusturuldugu anda java tarafindan olustutulur.
		// biz kendimiz bir constructor olusturdugumuzda java default constructoru imha eder.
		
		
		
		
		
		Constructor01 hondaCar = new Constructor01();// bir tane object uretildi.
		
		System.out.println("price: " + hondaCar.price);
		System.out.println("year: " + hondaCar.year);
		System.out.println("make: " + hondaCar.make);
		System.out.println("type: " + hondaCar.type);
		}

}
