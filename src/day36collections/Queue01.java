package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue : 	Queue ya eklenen elemanlar en sona eklenir listlerde oldugu gibi.
		// 		   	Queue da silinen elemanlar en bastan silinir.
		//			[1,2,3] ==> Bu queue den eleman silinmeye baslandiginda once bir silinir 
		//			FIFO ==> First In First Out
		
		
		// PriortyQueue elemanlari naturel ordere gore siralar.
		Queue <String> q = new PriorityQueue <>();
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q); // [A, B,C]
		// remove() methodu
		System.out.println("Silinen eleman: " + q.remove()); // A gitti ==> remove() methodu sildigi elemani return eder.
		System.out.println("kalan queue: " + q);
		q.remove("C"); // yazdirirsak true aliriz
		System.out.println("kalan queue: " + q);
		// remove methodu bos queue ler icin kullanilamaz.
		// LinkedList elemanlari sizin girdiginiz siraya gore dizer.
		Queue <String> qll = new LinkedList <>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);
		System.out.println("Ilk eleman: " + qll.element()); // ilk elemani dondurur. 
		
		System.out.println(qll.poll()); // ==> ilk elemani sildi ve return etti. 
		System.out.println(qll.poll());
		System.out.println(qll.poll());
		System.out.println(qll.poll());
		System.out.println(qll);
		
		// Not : remove () methodu bos queue ler icin kullanilirsa exception verir.
		//       poll() methodu bos queue icin kullanilirsa null verir.
	}

}
