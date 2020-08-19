package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		// kullanicdan 3 basamakli bir tam sayi alin 
		//bu sayinin rakanlari toplamini bulunuz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc basamakli bir tamsayi yaziniz");
		
		int s = scan.nextInt();       // kulanici 123 gisin diyelim.
		int sonRakam = s%10;         // son rakam icin modulus 10 yapariz.
		int ortaRakam = (s/10)%10;   // orta basamagi once ona bol sonra modulus 10 alacagiz
		int ilkRakam = s/100;       // 3 basamakli oldugu icin 100 e bolunur.
		
		                           // 4 basamakli olsaydi 1000 e bolerdik vs.
		
		
		
		System.out.println(sonRakam + ortaRakam + ilkRakam);
		
		scan.close();


	}

}
