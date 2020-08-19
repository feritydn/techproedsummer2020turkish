package day17constructors;

public class OdevSorusu02 {
	int x = 3;
	int y =5;
	OdevSorusu02 (){
		x +=1;
		System.out.println("-x" + x);
	}
	
	
	OdevSorusu02(int i){
		this();
		this.y = i;
		x += y;
		System.out.println("-x" + x);
	}
	
	
	OdevSorusu02(int i, int i2){
		this(3);
		this.x -=4;
		System.out.println("-x" + x);
	}
	
	public static void main(String[] args) {
		// What's the output?
		// OdevSorus02 mc = new OdevSorus02(4,3);

	}

}
