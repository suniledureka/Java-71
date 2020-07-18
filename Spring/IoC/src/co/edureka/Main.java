package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//initialize the spring container / IoC
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		
		Student st1 = (Student)factory.getBean("stud1");
		System.out.println(st1);
		
		Student st2 = factory.getBean("stud2",Student.class);
		System.out.println(st2);
	}
}
