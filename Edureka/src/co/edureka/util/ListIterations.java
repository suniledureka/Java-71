package co.edureka.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args)  throws Exception{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=11;i<=16;i++) {
			list.add(i);//boxing
		}
		System.out.println(list);
		
		iterate1(list);
		Thread.sleep(1500);
		
		iterate2(list);
		Thread.sleep(1500);
		
		iterate3(list);
		Thread.sleep(1500);

		iterate4(list);
		Thread.sleep(1500);	
		
		iterate5(list);
	}
	
	static void iterate1(List<Integer> list) {
		System.out.println("<<<iteration using a normal for loop with get() - only for java.util.List");
		for(int i=0;i<list.size();i++) {
			Integer n = list.get(i);
			System.out.print(n+"   ");
		}
		System.out.println();
	}
	
	static void iterate2(List<Integer> list) {
		System.out.println("<<<iteration using enhanced for loop");
		for(Integer n : list) {			
			System.out.print(n+"   ");
		}
		System.out.println();
	}	
	
	static void iterate3(List<Integer> list) {
		System.out.println("<<<iteration using java.util.Iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println();
	}
	
	static void iterate4(List<Integer> list) {
		System.out.println("<<<iteration using java.util.ListIterator- only for java.util.List");
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext())
		{
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println();
		while(it.hasPrevious())
		{
			Integer n = it.previous();
			System.out.print(n+"   ");
		}
		System.out.println();
	}	
	
	
	static void iterate5(List<Integer> list)
	{
		System.out.println("<<<iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(list);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
		System.out.println();
	}
}
