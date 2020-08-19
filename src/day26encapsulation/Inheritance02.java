package day26encapsulation;

// Inheritance01, Inheritance02'nin parent'i oalcak.
public class Inheritance02 extends Inheritance01 {

	public static void main(String[] args) {
		// Child'in birden fazla parent'i olur mu? 
		// Cevap: Olmaz. Java "multiple inheritance" desteklemez.
		// Java "single inheritance" ddestekler.
		
		// Parent'in 1 den fazla child'i olur mu?
		// Cevap: Olur. "Hiyerarsik Inheritance" denir
		// childe [a,b] ==> parend [c,d,e] ==> grandParend [f,g]
		// Child nelere sahip ? ==> a,b,c,d,e,f,g
		// Parend nelere sahip ? ==> c,d,e,f,g
		// grandParend nelere sahip ? ==> f,g

	}

}
