package co.edureka.util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) throws Exception{
		//Vector<Integer> v = new Vector<>(); 
		//Vector<Integer> v = new Vector<>(5); //5-capacity
		Vector<Integer> v = new Vector<>(5,3); //5-capacity, 3-capacity increment
		
		System.out.println(v+ "| Size="+v.size()+" | Capacity="+v.capacity());
		
		for(int i=11;i<=20;i++) {
			v.add(i);
		}
		System.out.println(v+ "| Size="+v.size()+" | Capacity="+v.capacity());
		
		v.add(21);
		System.out.println(v+ "| Size="+v.size()+" | Capacity="+v.capacity());
		
		Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+"   ");
			Thread.sleep(500);
		}
	}
}
