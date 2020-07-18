package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class SearchStudent1 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Student st = new Student(); //transient state
		System.out.println(st); //toString();
		
		try {
			session.load(st, Integer.valueOf(1015));
			//student object in persistent state
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println(st);
		session.close();
		sf.close();
	}
}
