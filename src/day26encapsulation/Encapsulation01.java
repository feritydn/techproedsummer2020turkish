package day26encapsulation;

public class Encapsulation01 {

	private String idNo = "12345678910";
	private int cardNo = 1234678;
	private boolean cold = true;
	
	public static void main(String[] args) {
		// encapsulation data saklama (data -hiding) yontemidir.
		// encapsulation iki stepte yapilir.
		// 1) data'yi (variable, method) private yapmaliyiz.
		// 2) public olan getter() ve setter() methodlar uretmeliyim.
		// getter() data'yi sadece okumamiza yarar. getter() methodu data'da degisiklik yapamaz.
		// setter() data'yi degistirmemize yarar.
		
	}
	// getter () uretmek icin 1) Access modifier public olmali
	//                        2) return type  variable ile ayni olmali
	//                        3) method ismi "get + variablename" seklinde olmali
	//						  4) method icine return yazilir.
	public String getIdNo () {
		return idNo;
	}
	public  int getCardNo() {
		return cardNo;
	}
	// return type boolean ise getter() method ismi "is" ile baslar get kullanilmaz.
	public boolean isCold() {
		return cold;
	}
	
	// setter () method uretmek icin 1) Access modifier public olmali
	//                               2) return type void olmali.
	//                               3) method ismi "set + variablename" seklinde olmali
	//                               4) parametre olmali (%99)
	//                               5) setter () methodlarin ismi boolean'lar icin de "set" ile baslar
	//
	public void setIdNo(String idNo) {
		this.idNo = idNo;
		
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
		
	}
	public void setCold(boolean cold) {
		this.cold = cold;
		
	}
}
