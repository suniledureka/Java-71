package co.edureka.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class SaveStudents 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
			System.out.println("enter student name , email and mobile:");
			String name = sc.next();
			String email = sc.next();
			String mobile = sc.next();
			
			Student st = new Student(name,email,mobile);
			
			session.save(st);
			
			System.out.print("More students to add [Y/N]: ");
			req = sc.next();
		}//while
		
		System.out.println("--------------------------------");
		tx.commit();
		
		sc.close();
		session.close();
		sfactory.close();
	}
}
