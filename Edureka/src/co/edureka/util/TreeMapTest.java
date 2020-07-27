package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Float> bank = new TreeMap<String,Float>();
		
		System.out.println(bank.put("Sunil",15000f)); //null
		System.out.println(bank.put("Sunil",11500.5f)); //15000.0
		bank.put("Naveen",12500f);
		bank.put("Rahul",10500f);
		bank.put("Pankaj",11500f);
		
		System.out.println(bank);
		bank.put(null,null);
		System.out.println(bank);
	}

}
