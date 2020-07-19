package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		EmployeeDAO dao = (EmployeeDAO)context.getBean("empdao");
		
		/*
		Employee emp = new Employee(110,"Rahul",45000f);
		dao.saveEmp(emp);
		*/
		
		Employee emp = new Employee(101,"Sunil",45000f);
		dao.updateEmp(emp);
	}
}
