package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		
		// bir int variable olusturun deger atayin
		// eger cift sayi ise ekrana cift yazdirin
		// deger tek sayi ise ekrana tek yazdirin.
		
		int num = 19; 
		// biz sayilari degistirerek test yaptik.
		
		if(num%2==0) {
			System.out.println("Cift");
			
		}
		
		if (num%2!=0) {
			System.out.println("tek");
		}

	}

}
