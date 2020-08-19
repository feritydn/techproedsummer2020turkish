package day38interviewhazirlik;

public class IntervviewHazirlik01 {
	/* 1) java "Platform Independent" programlama dilidir.
	 *    Yani; haerhangi bir platformlarda yazilan java kodu herhangi bir diger platformlarda da calisir.
	 *    Mesela kodu Mac'de yazdiniz, Windows'da da calisir.
	 * 
	 * 2) IDE ==> Integrated Dvelopment Envoiroment (Entegre edilmis kod ortami)
	 *    demektir. Eclipse ve IntelliJ piyasada kullanilan iki meshur IDE'dir
	 *    IDE'ler olmadan da kod yazilabilir. Eclipse veya ItelliJ bize yardim eder.
	 *    Cunku bize yardim ederler. IntelliJ daha yardimseverdir. Piyasadaki kullanimi artiyor.
	 *    
	 * 3) Constructor ==> Yeni bir object uretirken Constructor aktive olur ve objecti uretir.
	 *                    Return type'i yoktur
	 *                    Ismi class ismi ile ayni olmalidir.
	 *                    Object uretmek icin constructor uretmek zorunda degiliz cunku java
	 *                    her class icin default bir constructor uretmistir. Default
	 *                    constructorlar parametresizdirler ve biz bir constructor urettigimzde
	 *                    yok olurlar.
	 *                    Constructorlar overloading edilebilir. ama override edilemezler cunku
	 *                    Child classlardean cagrilabilirler ama overriding edilemezler cunku class
	 *                    isimi ile ayni olmalidir.
	 * 4) OOP concept nedir?
	 *                    OOp concept a) INheritence  b) Encapculation  C) Polymorphism
	 *                                 d  Abstraction  e) Interface icerir
	 *                                 
	 * 5) INheritence nedir? 
	 *                     Inheritence parent (Super Class) - child (sub class) iliskisidir.
	 *                     A classi B classina extends ederse A child B parent olur.
	 *                     A classi B interface'sine impliment ederse A child B parent olur.
	 *                     A interfacesi B interfacesi extends ederse A child B parent olur.
	 *                     Child kodlarin public ve protected olanlarini kullanabilir.
	 *                     Reusability, short code maintenence(tamir) faydalari vardir.
	 *
	 *6) Encaptulation nedir?
	 *                      Data hiding(Data gizlemektir) Datalar private edilerek gizlenir.
	 *                      Bu gizlenen datalar getter ile okunur setter ile update edilir.
	 *                      degistirrlimesini istemedigimz kodlari koruma altina almak icin 
	 *                      kullanilir. maintenence faydasi da vardir.
	 *                      kodun hic degirtirlmesini istemiyorsaniz sadece okunmasini istiyorsaniz setter 
	 *                      method olusturmayiniz
	 *                      Setteri olmayan classa immutable classlardir.
	 * 7) Polymorphism nedir?
	 *                      Polymorphism (Coklu yapi) overloading ve overloading demektir.
	 * 
	 * 8) Abstract class nedir? 
	 *                     Abstract class uretmek icin "abstract" keyword kullanmaliyiz
	 *                     Abstract classlardan obje uretilemez. (Instantiate(gorunurluluk)) yapilamaz
	 *                     Abstract classlarda hem abstract hem de concrete methodlar bulunabilir.
	 *                     Abstract methodun oldugu class kesinlikle abstract olmalidir.
	 *                     Abstract methdlarin concrate childlar tarafindan override edilme 
	 *                     zorunlulugu vardir. Concreteler override edilmese de olur.
	 *            ONEMLI   ***Abstract classi child classlari bazi gorevleri yapmak zorunda
	 *                     birakmak icin olustururuz.
	 *                     
	 * 9) Interface nedir?
	 *                    Java normalde multiple inheritence musaade etmez bu yuzden Abstract 
	 *                    class kullandigimizda multiple inheritence yapamayiz. Fakat bazi projelerde
	 *                    multiple inheritence kullanmakzorunda kaliriz. Bunu Java interface kullanma
	 *                    hakki vererek halletmistir. Cunku Interface lere multiple implemets yapilabilir.
	 *                    Detaylarina eclipse den bakiniz
	 *                    
	 * 10) Overloading nedir?
	 *                   Method ismi ayni tutularak parametrelerin sayialri, yerleri veya
	 *                   data type'leri degistirilerek methodlari olusturmaktir.
	 *                   Overloding Compile Time'dir.Yani overloadingte yaptiginiz hata kod yazarken belli olur.
	 *                   Ayni isme sahip methodlarla farkli islemler yapabilmek icin. Mesela subsitring methodunda
	 *                   bir tek parametreli bir de iki parametreli olan var.
	 *                   subsitring(4) veya subsitring(4,7) methodalrin fonksiyonlari esasinda aynidir. Ikiside bir
	 *                   Stringin belli bir bolumunu almaya yarar fakat bazi durumlarda bitis yerini belirlemek gerek
	 *                   bunu icin parametreleri farkililastiririz bu da overloadingi dogurur.
	 * 11 ) Overriding nedir?
	 *                   Method signatureye dokunmuyoruz. Sadece bodyi degistiriyoruz. Overriding Inherirence olunca
	 *                   olur aksi durumda olmaz. Ayni methodun farkli kullanimlari icin overriding gerklidir.
	 *                   Animal da ses(){} methodu var dog() {Havlama} ...
	 *                   Overriding Run Time Error verir.
	 *                   
	 * 12) Array ile Arraylist arasindaki farklar nelerdir
	 *                  Array olusturulurken uzunlugu belli edilmek zorundadir ve daha sonra uzunluk degistirilemez.
	 *                  Fakat arrayListlerde baslangiclada uzunlugu belitme zorunlulugumuz yok. eleman ekledikce ya da 
	 *                  ciartikca uzunluk artar veya azalir.
	 *                  
	 * 13) String ile StringBuilder arasindaki fark nedir?
	 *                  Stringler immutable'dir StringBuilder ise mutabledir. Stringler degistirilemezler ama StringBuilderler 
	 *                  degistirlebilir. StringBuilder Classi daha kullanisli methodlara sahiptir mesela reverse methodu.
	 *                  
	 * 14) 
	 *                     
	 */

}
