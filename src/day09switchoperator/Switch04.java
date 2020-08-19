package day09switchoperator;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		
		// Kullanýcýdan notunu alýn ve aþaðýdaki kurallara göre ekrana A, B, C veya D yazdýrýn.
		//1. 50 den az - D     
		//2. 50(dahil) ile 60 arasý - C       
		//3. 60(dahil) ile 80 arasý - B.     
		//4. 80(dahil) ustu- A
        
		// Switch de long, double,float, boolean kullanilmaz
		// int byte short char String kullanilir
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz");
		int not = scan.nextInt();
		
		// Switch te case den sonra sadece deger yazabiliriz
		// herhangi bir islem yapamazsiniz
		
		if (not >=0 && not <50) {
			not = 0;
			
		}else if (not >=50 && not <60) {
			not = 50;
		} else if (not >=60 && not <80) {
			not=60;
		}else if (not >=80 && not<=100) {
			not = 80;
		}
		
		
		switch (not) {
		
		case 0:
			System.out.println("D");
		break;
		case 50:
			System.out.println("C");
		break;
		case 60:
			System.out.println("B");
		break;
		case 80:
			System.out.println("A");
		break;
		default :
			System.out.println("gecerli not degil");
		
		}
		
		scan.close();
	}

}
