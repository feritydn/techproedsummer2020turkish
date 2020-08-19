package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Mapp bir Interfacedir. Map Interfacenin 3 tane child classi vardir.
		
		/* 1) HashMap: Hashmap key - value yapisini kullanir. Key ve value programci 
		 *             tarafindan uretilir.
		 *             key ve value'de null degeri kullanilabilir. Key'de 1'den fazla
		 *             null degeri kullanilirsa java son kullanilan null'i kabul eder.
		 *             Valuede birden fazla null degeri kullanilabilir.
		 *             Not: HashMap console yazdirildiginda hem key degerleri hem de value
		 *             degerleri aralarina = sembolu konularak yazdirir.
		 *             HashMap lar ekrana yazdirirken rastgele siralama yapar
		 *             Siralama yapmadigi icin HashMap maplar arasinda en hizlidir.
		 *             HashMap ler "thread safe" degildir.
		 *             thread safe ==> Ayni anda bir cok yerde calisamaz (reklem gibi)
		 */
		HashMap <Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "Ali");
		hashMap.put(1, "Veli");
		hashMap.put(2, "Mine");
		hashMap.put(0, "Kemal");
		System.out.println(hashMap);
		hashMap.remove(0);
		System.out.println(hashMap);
		System.out.println(hashMap.remove(3, "Mine")); // false verir
		System.out.println(hashMap.remove(3, "Ali"));  // Ali
		System.out.println(hashMap); // {1=Veli, 2=Mine}
		System.out.println(hashMap.get(2)); // mine
		//System.out.println(hashMap.get("Can"));
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		System.out.println(hashMap.size());
		System.out.println(hashMap.containsKey(3));
		System.out.println(hashMap.containsValue("Mine"));
		hashMap.replace(2, "Emin");
		System.out.println(hashMap);// Mine ==> Emin
		hashMap.clear();
		System.out.println(hashMap);
		

	}

}
