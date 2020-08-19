package day12scopewhileloop;

public class ScopeKurallari {

	public static void main(String[] args) {
		// Scope kapsam demektir.
		// olusturdugumuz bir variable i nerelerde kullanabilecegimizi gosterir.
		
		// Classin icinde ama methodun disinda bir varibale olusturursak
		// butun methodlar ulasabilir. Yazdigimiz yer cok onemli degil onmeli olan
		// classin icinde olup methodun icinde olmasi gibi.

	}
	
	public void toplama () {
		int num= 12;
		System.out.println("toplama" + num);
	}
	
	public void carpma (int num, String str) {
		System.out.println("Carpma");
	}
}

// Kural 1:  Classin icinde methodlarin disinda olan variablelari butun 
// methodlari istedikleri kadar kullanabilir. Bu variable lara "Class Variable"
//  veya "Instence Variable" denir.
//  Class variablelere deger atamasi  yapmazsak java onlara 
//default deger verir. Java tum sayilar icin default olarak 0 veriri.

// Kural 2: Bir methodun bodysi icinde olusturulan variableler
// sadece o methodun kullanimina aciktir. Diger methodlar kullanamaz.
// Methodun icinde olusturulan bu variablelre "Local variable" denir
// Body icinde olusturulan Local variablelere deger atamak zorundayiz.
// java onlara default value vermez.

// Kural3 : Methodlarin parantezleri icinde olusturulan variableler sadece
//o methodlarin bodyleri icinde kullanilabilir. Local variableler gibidirler.
// Bunlara da "Local Variable" denir ama bir farki vardir parantez icinde yapilan
// local variablelere deger atamasi YAPMAYINIZ.

// Kural 4: Bir variableyi kullanmaya baslamadan once tanimlamaliyiz.
// once num = num+2; sonra int num= 12; diyemeyiz hata verir.
// once int num = 12; sonra num= num+2; dememeliyiz.


