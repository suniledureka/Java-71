package co.edureka.jdbc;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		EmployeeDAO edao = EmployeeDAOFactory.getEmployeeDAO();
		
		/*
		//-- to save an employee --
		Employee emp = new Employee(107,"Naveen",2500.5f);
		edao.saveEmp(emp);
		*/
		
		/*
		//-- to update an employee --
		Employee emp = new Employee(101,"Sunil Joseph",5500.5f);
		edao.updateEmp(emp);
		*/
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("enter an employee no to delete : ");
		int eno = sc.nextInt();
		edao.deleteEmp(eno);
		*/
		
		/*
		System.out.print("search employee with emp no : ");
		int eno = sc.nextInt();
		Employee emp = edao.searchEmp(eno);		
		if(emp == null)
			System.out.println("No matching employee found");
		else
			System.out.println(emp); //toString();
		*/
		
		List<Employee> emps = edao.getEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
			Thread.sleep(1000);
		}
		
		sc.close();
	}
}
