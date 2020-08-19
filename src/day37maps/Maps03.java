package day37maps;

import java.util.TreeMap;

public class Maps03 {

	public static void main(String[] args) {
		/*TreeMap ==> 1) TreeMap keylerde null kullanmaya musade etmez ama
		 *               valuelerde istedigimiz kadar null kullanmaya musaade eder.
		 *            2) TreeMap eleman'larini console'e yazdirmak istediginizde
		 *               key'ler natural ordera gore siralanir.
		 *            3) treeMap en yavaslaridir.
		 */
		
	
		TreeMap <String, Integer> tMap = new TreeMap <>();
		tMap.put("Kanaat", null);
		tMap.put("Bezelye", 7);
		tMap.put("elma", 10);
		tMap.put("Armut", 8);
		System.out.println(tMap); // {Armut=8, Bezelye=7, Kanaat=null, elma=10}

	}

}
