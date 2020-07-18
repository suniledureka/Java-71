package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		/*
		Student st = new Student(102,"Anil","anil@gmail.com","9898989898");
		session.delete(st);
		*/
		
		Student st = session.get(Student.class, Integer.valueOf(110));
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}
		else {
			System.out.println("No matching student found!");
		}
		
		tx.commit();
		
		session.close();
		sf.close();		
	}
}
