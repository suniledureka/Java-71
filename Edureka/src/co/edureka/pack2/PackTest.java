package co.edureka.pack2;

import co.edureka.pack1.Nums;

public class PackTest {

	public static void main(String[] args) {
		Nums obj = new Nums();
		obj.addNum(10, 20);
		System.out.println("Diff = "+ obj.subNum(20f, 10f));
	}

}
