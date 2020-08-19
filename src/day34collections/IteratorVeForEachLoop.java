package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {

	public static void main(String[] args) {
		// Iterator bir colletion elemanlari arasinda gezer ve onlari istedigimiz
		// sekilde degistir. for each loop da gezer ama degistiremez. 
		
		List<String> list1 = new ArrayList <>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		list1.add("A");
		list1.add("B");
		
		System.out.println(list1); // [X, Y, Z]
		
		Iterator<String> iterator = list1.iterator();
		// hasnext Methodu bir sonraki eleman var mi yok mu kontrol eder.
		// X, Y, Z
		
		// Assagidaki kod iterator kullanarak tum elemanlari ekrana yazdirmaya 
		// yarar. 
//		while (iterator.hasNext()) {
//			System.out.print(iterator.next());
//		}
		System.out.println();
	
		for (String w: list1) {
			System.out.print(w);
		}
		System.out.println();
		
		// for each loop ile degisim yapalim.
		
		for (String w: list1) {
			w= w + "A";
			
		}
		System.out.println(list1);
		
		
		System.out.println();
		// iterator ile for each loop farki
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
	System.out.println(list1);
	}

}
