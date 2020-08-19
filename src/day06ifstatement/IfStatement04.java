package day06ifstatement;

public class IfStatement04 {

	public static void main(String[]args) {
		
		// Bir tane string variable olusturun ve bir gun ismin kucuk harfle deger atayin
		// Eger atadiginiz deger hafta ici gunlerinden birinin  ise 
		// Ekrana "Hafta Ici yazdirin"
		// hafta sonu gunlerinden biri ise ekrana "Haftasonu" yazdirin.
		
		String gun = "sali";
		
		if (gun.equals("pazar") || gun.equals("cumartesi")) {
			
			System.out.println("hafta sonu mutlu tatiller");
			
		}
		
		
		if (gun.equals("pazartesi")  || gun.equals("sali")  || gun.equals("carsamba") || gun.equals("persembe")|| gun.equals( "cuma")) {
			System.out.println(" hafta ici kolay gelsin");
		}
		
	}
}
