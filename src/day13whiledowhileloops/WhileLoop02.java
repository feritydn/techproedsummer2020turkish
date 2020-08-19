package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		// Ilk bes sayma sayisinin carpimini ekrana yazdiran
		// programi yaziniz
		
		int product = 1;
		
		int num = 1;
		
		while (num<6) {
			product = num*product;
			num++;
		}
		System.out.println(product);
	}

}
