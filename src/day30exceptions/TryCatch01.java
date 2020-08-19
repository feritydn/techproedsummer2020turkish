package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 0;
		// finally {} block exception olsa da olmasa da her zaman calisir.
		// finally {} block try catch blocktan sonra yazilir.
		try {
			System.out.println(num1/num2);
		}catch (ArithmeticException e) {
			System.out.println("Sifir ile bolme yapilamaz");
		}finally {
			System.out.println("Isleminiz bitmistir");
		}
		
		// Inteview Sorusu: MUTLAKA SORACAKLAR:
		// Final, Finally, Finaleze keywordlerinin farki nedir?
		/*
		 * 1) Finally{}(block) ==> try-catch blocktan sonra kullanilir.
		 *                         exception olsada olmasa da calisir.
		 *                  
		 * 2) Final (keyword) ==> variablelerde final kullanilirsa o varablenin
		 *                        degeri degistirlemez. Mesela pi sayisi final
		 *              		  yapildigi zaman degeri degistirilemez.
		 *              
		 *                        Methodlarda final kullanilirsa methodun body
		 *                        kismini degistiremezsiniz. Yani Overrideng yapilamaz.
		 *              
		 *                        Classlarda final kullanilirsa o class extends edilemez.
		 *                        ILGINC
		 *                       Inheritence mumkun degildir.
		 *                       public final class Animal {  } ==> public class Dog extends Animal{ } OLMAZ
		 *              
		 * 3) finalize () (method) ==> Finalize ()methodu, Garbage Collectorin imha edilecek
		 *                             datalari imha edilecek hale getirir.                             
		 */

	}

}
