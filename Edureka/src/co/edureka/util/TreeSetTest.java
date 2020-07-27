package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Anil")); //true
		names.add("Praveen");
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Naveen");
		System.out.println(names.add("Sunil")); //false
		
		names.add(null);
		System.out.println(names +" | Size = "+names.size());
		
		//System.out.println("Anil".compareTo("Sunil"));
	}
}
