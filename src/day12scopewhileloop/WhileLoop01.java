package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// While ==> iken demek
		// While I go to schhol ==> Ben okula giderken
		
		int num = 0;
		
		// num 4 ten kucuk iken demek
		while (num <4) { // parantez icindeki condition true oldugu surece while loop calisir.
			System.out.println("Ali");
			num++; // bu satiri unutursak sonsuz dongu olur.
			
		}
		// While loop kullanarak birden ona kadar tamsayilari ekrana yazdir.
		
		int num1 =1;
		while (num1 <=10) {
			System.out.print(num1 + " ");
			num1 ++;
			
		}
		System.out.println();
		// while loop kullanarak 1 den 20 ye jkaadar cift sayilar
		
		int num2 = 1;
		
		while (num2<=20) {
			if (num2 %2 ==0) {
			System.out.print(num2 + " ");}
			
			num2++;
			
		}
		System.out.println();
		// while loop kullanarak 5 ten 120 kardar 3 ile bolunen
		
		int num3 = 5;
		
		while (num3 <121) {
			if (num3 %3 ==0) {
				System.out.print(num3 + " ");
				
			}
			num3++;
			
		}

	}

}
