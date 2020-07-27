package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws Exception {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Sunil",15000f)); //null
		System.out.println(bank.put("Sunil",11500.5f)); //15000.0
		bank.put("Naveen",12500f);
		bank.put("Rahul",10500f);
		bank.put("Pankaj",11500f);
		
		System.out.println(bank);
		System.out.println("-----------------------------");
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of Sunil = "+ bal);
		bal = bal + 1150.5f;
		bank.put("Sunil",bal);
		System.out.println(bank);
		System.out.println("-----------------------------");
		
		System.out.print("A/C Holders = ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name + " | ");
		}
		System.out.println();		
		System.out.println("-----------------------------");
		
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Float> entry = it.next();
			String name = entry.getKey();
			bal = entry.getValue();
			System.out.println(name+" : "+bal);
			Thread.sleep(1000);
		}
		
		bank.put(null,null);
		System.out.println(bank);
	}
}
