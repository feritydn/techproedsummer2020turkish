package day16overloading;

public class Overloading01 {// overloading asiri yukleme 

	public static void main(String[] args) {
		/*
		 * iki sayinin toplamini ekrana yazdiran bir method olusturun
		 * 
		 */
		 toplama (2,3);      // Method 1 
         toplama (14,15,10); // Method 2 
         toplama (2.3,3);    // Method 3
         toplama (5,4.1);    // Method 4
	}
	// methodun body kismini degistirmek yeterli olmadi.
								//Overloading yapma yollari
	// 1. parametrelerin sayisini degistirerek ayni isimli medhodlar olusturabiliriz.
	// 2. parametre sayisini degistirmeden herhangi bir parametrenin data type nin degistirerek de
	//    ayni isimli methodlar olusturabiliriz.
	// NOTE: toplama (2,3) cagrisi iki data type da int ise int sonucu verir. eger yoksa double olani secer.
	
	// 3. FARKLI!!! data type indeki parametrelerin yerlerini degistirerek de ayni ismli
	//    methodlar olusturabiliriz.
	
	// Method 1 
	public static void toplama(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	// Method 2 
	public static void toplama(int num1, int num2, int num3) {
		System.out.println(num1 + num2+ num3);
	}
	// Method 3 
	public static void toplama(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	// Method 4 
	public static void toplama(int num2, double num1) {
		System.out.println(num1 + num2);
	}
}
