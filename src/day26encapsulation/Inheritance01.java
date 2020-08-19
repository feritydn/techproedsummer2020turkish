package day26encapsulation;

public class Inheritance01 {

	public static void main(String[] args) {
		// Inheritance (miras) demek: Iki class arasinda Parent - Child iliskisi
		// varsa Inheritance'dan bahsedilebilir.
		
		// Inheritence kurallari 
		// 1) Inheritence public ve protected datalar icin problemsiz calisir.
		// 2) Inheritence default datalar icin chil ile parent ayni package de ise calisir.
		// 3) Inheritence private datalae icin calismaz.
		
		
		// Child ve Parent iliskisi nasil kurulur?
		// Class olustururken "extends" keyword kullaniriz.
		
		Encapsulation01 obj1 = new Encapsulation01();
		System.out.println(obj1.getIdNo());

	}

}
