package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// HashSet 	1) Tekrarli eleman (duplication) kullanimina izin vermez.
		//			2) Her data icin unique bir kod uretmeye hash sistemi denir.
		// 			3) Mesela okullardaki kayit sistemi gibi. Mesela uni no 28 yil gibi
		//			4) unique olan kisma key, data olan yere value deriz. Key her zaman unique iken
		//			   data ise bazen uniqe bezen not unique dir.
		//			5) mesela Arraylistlerde value unique degilken HashSet'te unique'dir
		//			6) key - Value yapisini kullanir ve key - value HashSette daima unique dir.
		//          7) En guzel orenek sozluklerdir.
		
		HashSet <String> hSet = new HashSet<>();
		// listlerde  add methodu hep yeni elemani en sona ekler ama hashSetlerde boyle bir zorunluluk yok.
		//HashSet ler elemanlari ekrana rastgele yazdir ve hic bir kurali yoktur.
		hSet.add("Aplee");
		hSet.add("Mango");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		hSet.add("Peach");
		// Ayni eleman hashSet e eklenmek istendiginde CTE veya RTE alinmaz. Son eklenen eleman ilk eklenen elemani 
		// usutune yazilir.
		hSet.add("Aplee");
		System.out.println(hSet.hashCode()); // bizi hic alakadar etmez
		System.out.println(hSet);
		

	}

}
