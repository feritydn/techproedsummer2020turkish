package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		System.out.println(toplama(11,15.2)); //26.2
		//parantezin icindeki degerlere argument denir
		
		// eger toplama yazmasak console hicbir sey yazmaz.
		// bu olaya call method denir.
		// bu durumda main methodun icini sadelestirmek ve okunurlugunu artirir.
		// bir methodu main in icine cagiracaksak mutlaka static koymaliyiz.
		// parametrenin data type ile argument in data type eslesmeli.
		System.out.println(carpma(13,5)); //15
		
	}
	public static double toplama(int num1,double num2) {
		// methodun parantezi icine yazilan data type ve variableye parametre denir.
		
		return num1+num2;
		
	}
	
	public static int carpma(int num1, int num2) {
		
		return num1*num2;
		
	}
}
