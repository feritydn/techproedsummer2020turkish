package day18statickeyword;

public class Static01 {
	
	static int en = 12;
	static int boy = 10;
	static int alan; //int alan = en *boy;
	static int yaricap =4;
	static double pi;
	
	// eger bir variableyi olustururken hesap yapmamiz gerekirse 
	//"Static block" olusturmak iyidir. Yani "int alan = en*boy" demek yerine
	// "Static block" olusturup onun icine yazmak daha iyidir.
	
	// "static block" variablelere deger atamak icin de kullanilabilir.
	// "static block" class olusturuldugu zaman olusturulur. En basta olmasi lazim.
	
	// "staic block" tum methodlardan ve constructorlardan once calistirilir.(Main method dahil)

	// birden fazla "static block" varsa ustteki once calisir.
	
	static {
		alan = en*boy;
		pi = 3.14;
		
		// "Static block" classin icinde butun methodlarin disina 
		// ve constroctorlarin disina yazilir.
	}
	
	static {	
		pi = 3.14;
	}
	public static void main(String[] args) {

		
	}

	// Static class olusturulabilir ama alt(inner class) classlar static olabilir
	// ust classlar (outer) static olamazlar.
	
	 static class InnerClass {
		
	}

}
