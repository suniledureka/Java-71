package co.edureka.pack1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml"); 
		
		Databases obj = (Databases)context.getBean("dbs");
		
		List<String> dbs = obj.getDbNames();
		System.out.println(dbs);
	}
}
