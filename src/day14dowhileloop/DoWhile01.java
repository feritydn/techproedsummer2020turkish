package day14dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
		int num= 1;
		do {
			System.out.print(num + " ");
			num++;
			
		}while (num<4);
		
		// 10 ile 20 arasindaki tek tam sayilari ekrana dowhile loop ile yazdirin
		
		int num1 = 11;
		
//		do {
//			if (num1 %2 !=0) {
//				System.out.println(num1);
//			}
//			
//			num1++;
//			
//		}while (num1<=20);
		
		System.out.println();
		
		do {
			System.out.print(num1 + " ");
			num1 = num1+2;
		}while (num1<20);

	}

}
