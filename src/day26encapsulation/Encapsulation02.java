package day26encapsulation;

public class Encapsulation02 {

	private char ilkHarf = 'F';
	private double para = 23.75;
	private boolean emekli = false;
	// variable ye atanan degerin degistirilmesini istemiyorsaniz o variable ilgili
	// setter () olusturmamalisiniz.
	
	// variable ye atana degerin okunmasini istemiyorsaniz getter olusturmamalisiniz.
	
	// sadece getter () kullanir ve hic setter() kullanmazsaniz variableler update edilemez demektir.
	// Bu tarz classlara "immutable Class" denir.
	
	// sadece getter () kullanir ve hic setter() kullanmazsaniz variableler okunamaz demektir.
	
	public static void main(String[] args) {
		Encapsulation01 obj = new Encapsulation01 ();
		System.out.println(obj.getIdNo());
		System.out.println(obj.getCardNo());
		System.out.println(obj.isCold());
		obj.setIdNo("1000000000");
		System.out.println(obj.getIdNo());

	}

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public double getPara() {
		return para;
	}

	public void setPara(double para ) {
		this.para = para;
	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}

}
