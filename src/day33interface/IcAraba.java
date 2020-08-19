package day33interface;


public interface IcAraba {
	
	int price = 2000;
	boolean old = true;
	
	public void direksiyon();
	public void koltuk ();
	public void klima ();
	
	// default keywordunu kullanirsak methoda mutlaka body eklemeliyiz.
	// aksi takdirde CTE aliriz.
	public default void doseme () {
		System.out.println("Interfacede default keyword ile doseme yaptim");
	}
	
	// default keywordunu kullanirsak methoda mutlaka body eklemeliyiz.
	// aksi takdirde CTE aliriz. Genellikle default kullanilir.
	public static void isitma () {
		System.out.println("Interfacede static keyword ile doseme yaptim");
	}
}
