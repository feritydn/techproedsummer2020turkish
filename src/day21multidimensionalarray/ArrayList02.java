package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {


		// Listler data type olarak primitive kabul etmez
		// Data type i olarak wrapper class kullaniriz (Primitive icin)
		List <Integer> list01 = new ArrayList<>();
		
		// bu lsitin icinde eleman olup olmadigini kontrol edin.
		
		// isEmpty () methodu kullanilir
		System.out.println(list01.isEmpty());
		// Bos ise True dolu ise False return eder.
		
		// Bu list'e bir eleman ekleyin
		
		list01.add(123);
		System.out.println(list01);
		System.out.println(list01.isEmpty());
		
		// Listten eleman silmek icin remove() methodu kullanilir.
		
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);
		list01.remove(1);       // Indexi bir olan elemani silecek.
		System.out.println(list01);
		list01.remove(0);
		System.out.println(list01);
		
		list01.remove(list01.size()-1);
		System.out.println(list01);
		
	}

}
