package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean birth = true;
	
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		Mammal mammal01 = new Mammal (15);
		mammal.move();
		mammal01.eat();
	}
	
	public void feed () {
	System.out.println("Cocuklarini besler");
	}
	
	Mammal(){
		this (11);  // super parentteki parametresiz constuctoru cagir demektir.
		           //  super () keywordunu kullanmasaniz da olur ama bazen kullanir sasirmayin.
		         //   Super() kullanilacaksa mutlaka ilk satirda olmali.
				//    Super () ve this() ayni constructor da kullanilamaz cunuku ikisi de ilk satirda olmak istiyor.
		
		System.out.println("Mammal parametresiz constructor");
	}

	public Mammal(int age) {
		super();
		System.out.println("Child Consructor called by this");
	}
}

