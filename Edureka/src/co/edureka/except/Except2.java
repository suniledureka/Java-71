package co.edureka.except;

public class Except2 {

	public static void main(String[] args) {
		String str = "625";
		int n = 25;
		System.out.println(str+n); //62525
		
		int n1 = Integer.parseInt(str);
		System.out.println(n+n1); //650
		
		//n1 = Integer.parseInt("A");
		n1 = Integer.parseInt("625.25");
		
		System.out.println(n1); //java.lang.NumberFormatException
	}
}
