package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.domains.Student;

public class SaveStudent {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("co/edureka/configs/hibernate.cfg.xml"); //XML Parsing
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		//Student st = new Student(101,"Sunil","sunil@hotmail.com","9848586878");
		
		Student st = new Student();
		st.setStudid(102);
		st.setSname("Anil");
		
		//save student object with Hibernate
		session.save(st);
		System.out.println("----------------------------------");
		
		tx.commit(); 
		
		session.close();
		sf.close();
	}
}
