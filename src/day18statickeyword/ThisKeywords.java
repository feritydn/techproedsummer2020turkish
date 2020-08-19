package day18statickeyword;

public class ThisKeywords {
	
	int x = 12;
	static int y = 13;
	
	ThisKeywords (int x){
		// this kullandigim zaman icinde bulundugum classdaki instance 
		// veya static variablelere ulasmak isitiyorum demektir.
		this("Ali");
		// bu classin icindeki parametresiz constructur u cagir demek
		// eger "this ()" kullanilacaksa mutlaka ilk satira yazilmalai
		// aksi takdirde compile time error verir.
		// "This ("Ali")" bu classtadi string parametreli constructoru cagirir.
		
		this.x = x;
		System.out.println("Parametreli constructor");
	}
	
	ThisKeywords(){
		System.out.println("Parametresiz constructor");
	}
	
	ThisKeywords(String str){
		System.out.println("String Parametreli constructor");
	}

	public static void main(String[] args) {
		ThisKeywords obj1 = new ThisKeywords(15);
		System.out.println(obj1.x); // 15

	}

}
