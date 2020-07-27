package co.edureka;

public class BoxingTest {

	public static void main(String[] args) {
		int n1 = 26;
		Integer n2 = n1; //boxing
		int n3 = n2; //unboxing
		System.out.println(n1+" | "+n2+" | "+n3);
		
		Integer i1 = Integer.valueOf(25);
		Integer i2 = Integer.valueOf(34);
		
		Integer i3 = i1 + i2; //unboxing + addition+ boxing
		System.out.println(i3);
	}
}
