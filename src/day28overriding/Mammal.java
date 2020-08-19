package day28overriding;

public class Mammal extends Animal {

	public boolean birth = true;
	public String name = "Pamuk";
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		mammal.feed();
		
		
	}
	
	public void feed () {
		System.out.println("Yavrularini besler");
	}
	
	public Mammal () {
		
		// this icinde bulundugunuz classdaki variable ve methodlara ulasmanizi saglar.
		// Child Parent iliskisi varsa this() kullanarak parent classdaki variable ve
		// methodlara da ulasabilirsiniz.
		
		// COK ONEMLI: Eger child ve Parentte ayni isimde instence varsa this parenttekini
		// gormez Child'dekini yazar.
		// Herkes sunu bilir "this" Child icin "super" parent icindir. Insanlar boyle kullanir.
		System.out.println(this.birth); //true
		this.feed();
		System.out.println(this.age); // 4
		System.out.println(this.name); // Pamuk
		this.move(); // Hayvanlar hareket eder
		System.out.println(this.name); // Pamuk
		
		// Parantezsiz super parentlerdeki variable ve methodlara ulasmanizi saglar.
		// Parenttekilere super kullanarak ulasmak daha guvenlidir.
		System.out.println(super.age); // ilk satirda yazilma sarti yok.
		System.out.println(super.name);
		super.move();
	}

}
