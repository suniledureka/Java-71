package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Anil")); //true
		names.add("Praveen");
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Naveen");
		System.out.println(names.add("Sunil")); //false
		
		System.out.println(names +" | Size = "+names.size());
	}
}
