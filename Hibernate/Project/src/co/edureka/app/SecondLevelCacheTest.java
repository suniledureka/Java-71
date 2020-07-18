package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class SecondLevelCacheTest {

	public static void main(String[] args) throws Exception {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		
		Student st1 = session1.get(Student.class, Integer.valueOf(101));
		System.out.println(st1);
		System.out.println("----------------------------------------");
		
		Thread.sleep(3000);

		Student st2 = session2.get(Student.class, Integer.valueOf(101));
		System.out.println(st2);		
		
		session1.close();
		session2.close();
		sf.close();
	}

}
