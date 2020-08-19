package day17constructors;

public class Constructors04 {

	int num1 = 12;
	static int num2=22;
	
	public static void main(String[] args) {
		// static methodlarin icinde sadece ststic elemanlar kullanilabilir.
		// num1 static olmadigindan main methodun icinde kullanilamaz.
		// num2 static oldugundan main methodun icinde kullanmamiz problem degil.
		
		// num1++; // comenti kaldirirsaniz num++; java compile time error verir.
		num2++;
		
	}

}
