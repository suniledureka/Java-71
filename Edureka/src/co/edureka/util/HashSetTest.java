package co.edureka.util;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Anil")); //true
		names.add("Praveen");
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Naveen");
		System.out.println(names.add("Sunil")); //false
		
		names.add(null);
		System.out.println(names +" | Size = "+names.size());
	}
}
