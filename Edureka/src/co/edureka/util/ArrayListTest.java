package co.edureka.util;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+" | Size="+names.size());
		
		names.add("Sunil");
		names.add("Anil");
		names.add("Praveen");
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Naveen");
		names.add("Sunil");
		System.out.println(names+" | Size="+names.size());
		
		names.add(1,"Sachin");
		names.set(2,"Denil");
		System.out.println(names+" | Size="+names.size());
		
		System.out.println(names.contains("Sunil"));
		
		System.out.println("Person @ index 0 = "+ names.get(0));
		
		System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
		System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
		
		System.out.println(names.remove("Sunil"));
		System.out.println(names.remove(0));
		System.out.println(names+" | Size="+names.size());
	}
}
