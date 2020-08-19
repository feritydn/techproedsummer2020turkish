package day32abstraction;

public interface Interface01 {
	
	// Interface icine concrete method yazamazsiniz.
	// Eger yazarsak compile time error aliriz.
	
	// Interfacede method olustururken kesinlikle body yazmayin/
	// interfacedeki methodlar kesinlikle abstract olmalidir.
	// interfacedeki abstract methodlari uretirken abstract 
	// keywordunu kullansak da olur kullanmasakda.
	// interface kendi icine yazilan methodlari otomatik olarak abstract kabul edilir.
	
	public void add();
	public abstract void subtract();
	
	// interfacede variableler mutlaka : public static ve final olmalidirlar.
	// mmutlaka initialze (deger atamali) edilmelidirler
	
	// variable olustururken "public static final" keywordleri kullanilsada 
	// kullanilmasa da olur. Interface onlari otomatik atar.
	// kullanilmasa da variable "public static final" dir
	
	public static final int a =12;
	int b = a-1;
	public int c =10;
	final int d = 9;
	static int e = 8;
	
	
	
}
