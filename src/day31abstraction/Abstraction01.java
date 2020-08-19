package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		// Abstract classlardan obje uretilemez.
		// Constructorlari yoktur.
		// Abstract classlar contrete (body'li) ve abstract(body'siz)
		// methodlar icerebilir.
		// Abstract classlarin hem contrete hem de abstract class childlari olabilir.
		// Abstract classin child'i contrete class ise Abstract classdaki 
		// Abstract methodlari mutlaka override etmeli ve onlara body eklenmelidir.
		// Abstract classin child'i Abstract class ise Abstract classdaki 
		// herhangi bir seyi override etmek zorunda degiliz.
		
		// ===> Bunun faydasi sudur: Child classlarda mutlaka olmasini istedigimiz
		//      methodlari bu sekilde belirlemis oluruz.
		
		
		
	}
	
	public void concreteMethod() {
		System.out.println("Ben concrete'yim");
	}
	
	public abstract void abstractMethod();

}
