package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		// While loop kullanarak ilk 5 sayma sayisinin toplamini
		// ekrana yazdiran programi yazizniz
		
		int sum = 0;
		int num =1;
		
		while (num<6) {
			
			sum = sum +num;
			num++;
		}
				
		System.out.println(sum);	
		// sadece en son toplami gormek icin disarida yaziyoruz
		// her adim icin gormek istiyorsa  loopun icine yaziniz
	}

}
