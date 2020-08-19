package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		/*HashTable ==> HashTable HashMap ile hemen hemen aynidir.
		 * 				Farkalri; 
		 * 				1) HashTable Key ve Valuelerde null a musade etmez.
		 * 				2) HashTable thread safe'dir. Bir kac isi ayni anda yapabilir
		 *              3) Console yazdirildigunda HashMap gibi rastgele yazdir.
		 *              4) HashTable daha yavastir.
		 */
		
		Hashtable <String, String> hTable = new Hashtable <>();
		hTable.put("Dil", "Kalp");
		hTable.put("Gonul", "Kalp");
		hTable.put("Dil", "Lisan");
		// ==>hTable.put(null, "Agiz"); // Run Time Error verir.
		// hTable.put("Kannat", null);  //  "   "     "    "
		hTable.put("Dil", "");
		System.out.println(hTable); // {Dil=Lisan, Gonul=Kalp} ayni key degerini tekrar
									// kullanirsaniz son value yi kabul eder.
		
	}

}
