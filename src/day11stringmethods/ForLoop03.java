package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		
		// ilk 4 sayma sayisinin carpimini veren for loop olusturunuz.
		// 1 , 2, 3, 4 ==> 1*2*3*4 =24
		
		int product = 1;
		
		for (int i =1 ; i<5 ; i++) {
			
			product = product *i;
			
		}
		System.out.println(product);
		
		// ilk 6 cift sayma sayisinin carpimi
		
		int product2 = 1;
		
		for (int i =2 ; i<13 ; i = i +2) {
			product2 = product2 *i;
		}
			System.out.println(product2);	
				
		// Matematikten birer birer geri gelip saymaya faktoriyel denir
		// bu interview sorusudur.
			
		long product3 = 1;
		
		for (int i =1 ; i<10 ; i++) {
			product3 = product3 * i;
			
			
		}
		System.out.println("9!= " + product3);
			

	}

}
