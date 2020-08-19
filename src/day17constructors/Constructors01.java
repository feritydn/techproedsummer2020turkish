package day17constructors;

public class Constructors01 {
	
	String name = "Ali Can";
	int age = 33;
	
	// Method ile main method ayni class da ise methodun sadece 
	// ismini kullanarak cagirabiliriz.
	public static void main(String[] args) {
		buyume(33);
		isimDegistir("Ayse Han");
	}
	
	public static void buyume (int age) {
		age++;
		System.out.println(age);
	}
	
	public static void isimDegistir(String name) {
		System.out.println(name);	
	}

}
