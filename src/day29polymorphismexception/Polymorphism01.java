package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// polymorphisme ==> coklu yapi demek
		// overloading ve overriding ile bir method polymorphism haline getirilir.
		// javada bir methodu yapmak ya overloading ya da overriding yaparak yapilir.
		// Polymorphism i overloading ile yaparsak "Run time Polymorphism" denir
		//        diger adi Static polymorphism'dir
		
		// Polymorphism i overloading ile yaparsak "Compile time Polymorphism" denir
		//       diger adi dinamic polymorphism'dir.
	}
	
	public void eat() {
		System.out.println("eat");
	}
	// overloading ile polymorphism ettik
	public void eat(String name) {
		System.out.println(name + "eat");
	}
	// overriding ile polymorphism
	class Yeni extends Polymorphism01{
	public void eat() {
		System.out.println("Please eat");
	}
	}
}
