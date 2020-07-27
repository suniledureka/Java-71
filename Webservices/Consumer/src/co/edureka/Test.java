package co.edureka;

public class Test {

	public static void main(String[] args) throws Exception{
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums obj = locator.getNums();
		
		System.out.println("Sum = "+ obj.addNum(10, 20));
		System.out.println("Diff = "+ obj.subNum(20.1f, 10.9f));
	}
}
