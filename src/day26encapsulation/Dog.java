package day26encapsulation;

public class Dog extends Mammal {
	
	public boolean sadik = true;

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println("Animal Class'dan geldi: " +  dog.age);
		System.out.println("Animal Class'dan geldi: " + dog.name);
		dog.eat();
		dog.move();
		System.out.println("Mamal Class'dan geldi: " + dog.birth);
		dog.feed();
		System.out.println("Dog Class'dan geldi: " + dog.sadik);
		dog.bark();

	}
	public void bark () {
		System.out.println("Kopekler havlar");
	}
}
