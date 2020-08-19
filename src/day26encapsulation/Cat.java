package day26encapsulation;

public class Cat extends Mammal {

	public boolean clean = true;
	
	public static void main(String[] args) {
		Cat cat = new Cat ();
		System.out.println("Animal Class'dan geldi: " +  cat.age);
		System.out.println("Animal Class'dan geldi: " + cat.name);
		cat.eat();
		cat.move();
		System.out.println("Mamal Class'dan geldi: " + cat.birth);
		cat.feed();
		System.out.println("Cat Class'dan geldi: " + cat.clean);
		cat.meow();
		

	}
public void meow () {
	System.out.println("Kediler miyavlar");
}
}
